import { Component, OnInit, Input } from '@angular/core';
import { Product } from 'src/app/shared/models/product';
import { ProductService } from 'src/app/services/product.service';
import { StoreService } from 'src/app/store/services/store.service';

@Component({
  selector: 'app-admin-product-item',
  templateUrl: './admin-product-item.component.html',
  styleUrls: ['./admin-product-item.component.scss']
})
export class AdminProductItemComponent implements OnInit {

  @Input() product: Product;

  products: Product[] = [];
  selectedProduct: Product;
  

  constructor(private storeServices: StoreService, private productServices: ProductService) { }

  ngOnInit(): void {
  }

  onSelectedProduct(productId): void{
    this.storeServices.setSelectedProductId(productId);
    this.selectedProduct = this.products.find(ele => ele.id === productId);
  }

  editProduct(product){
    this.selectedProduct = product;
  }

  
}
