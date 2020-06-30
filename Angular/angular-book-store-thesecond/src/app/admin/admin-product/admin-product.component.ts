import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { products } from 'src/app/shared/mock-data/product-list';
import { Product } from 'src/app/shared/models/product';

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
  isEditting = false;
  selectedProduct: Product;
 
  
  constructor() { }

  ngOnInit(): void {
    this.products = products;
    const publishersObj = {};
    const authorsObj = {};
    products.forEach(ele => {
      publishersObj[ele.publisher] = ele.publisher;
      authorsObj[ele.author] = ele.author;
    });
    this.publishers = Object.keys(publishersObj);
    this.authors = Object.keys(authorsObj);
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

  
}
