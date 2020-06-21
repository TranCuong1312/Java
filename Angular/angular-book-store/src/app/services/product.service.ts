import { Injectable } from '@angular/core';
import { Product } from 'src/app/shared/models/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products: Product[] = [
  ];

  constructor() { }

  getProducts(): Product[]{
    return this.products;
  }
}
