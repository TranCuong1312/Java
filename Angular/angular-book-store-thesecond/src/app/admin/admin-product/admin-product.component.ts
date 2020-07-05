import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { products } from 'src/app/shared/mock-data/product-list';
import { Product } from 'src/app/shared/models/product';
import { Router, ActivatedRoute } from '@angular/router';
import { ProductService } from 'src/app/services/product.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-admin-product',
  templateUrl: './admin-product.component.html',
  styleUrls: ['./admin-product.component.scss']
})
export class AdminProductComponent implements OnInit {
  @Output() selectProduct = new EventEmitter<string>();

  products: Product[] = [];
  publishers: string[];
  authors: string[];
  originProducts = products;
  add = true;
  addReactive = true;
  isEditting = true;
  selectedProduct: Product;
  isFetching = true;
  
 
  
  constructor(private router: Router, private route: ActivatedRoute, private productService: ProductService) { }

  ngOnInit(): void {
    this.productService.getProducts().subscribe(result => {
      this.isFetching = false;
      this.products = result;
    });
  }

  trackByFn(index, item) {
    return item.id;
  }

  onSelectedProduct(productId): void {
    this.selectProduct.emit(productId);
  }

  addProduct(){
    this.add = false;
  }

  addProductReactive(){
    this.addReactive = false;
  }

  viewDetail(product: Product): void{
    this.router.navigate(['product', product.id], { relativeTo: this.route });
  }
  
}
