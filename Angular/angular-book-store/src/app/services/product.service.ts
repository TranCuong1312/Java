import { Injectable } from '@angular/core';
import { Product } from 'src/app/shared/models/product';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products: Product[] = [
  ];

  constructor(private http :HttpClient) { }

  getProducts(): Product[]{
    return this.products;
  }

  createProduct(product: Product){
    return this.http.post('https://angular-book-store-d1bc5.firebaseio.com/product.json', {product});
  }

  getProduct(){
    return this.http.get('https://angular-book-store-d1bc5.firebaseio.com/product.json');
  }

  
}
