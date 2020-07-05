import { Component, OnInit, Input } from '@angular/core';
import { Product } from 'src/app/shared/models/product';
import { ProductService } from 'src/app/services/product.service';
import { StoreService } from 'src/app/store/services/store.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-admin-product-item',
  templateUrl: './admin-product-item.component.html',
  styleUrls: ['./admin-product-item.component.scss']
})
export class AdminProductItemComponent implements OnInit {

  @Input() product: Product;

  products: Product[] = [];
  selectedProduct: Product;
  isFetching = true;
  

  constructor(private storeServices: StoreService, private productServices: ProductService, private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.productServices.getProducts().subscribe(result => {
      this.isFetching = false;
      this.products = result;
    });
  }

  onSelectedProduct(productId): void{
    this.storeServices.setSelectedProductId(productId);
    this.selectedProduct = this.products.find(ele => ele.id === productId);
  }

  editProduct(product){
    this.selectedProduct = product;
    
  }

  viewDetail(product: Product): void{
    this.router.navigate(['product', product.id], { relativeTo: this.route });
  }

  deleteProduct(productID){
    this.productServices.deleteProduct(productID);
  }
}
