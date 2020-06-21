import { Component, OnInit, Output } from '@angular/core';
import { products } from 'src/app/shared/mock-data/product-list';
import { Product } from 'src/app/shared/models/product';
import {StoreService} from 'src/app/store/services/store.service';
import { EventEmitter } from '@angular/core';

@Component({
  selector: 'app-admin-product-list',
  templateUrl: './admin-product-list.component.html',
  styleUrls: ['./admin-product-list.component.scss']
})
export class AdminProductListComponent implements OnInit {

  @Output() selectPorduct = new EventEmitter<string>();

  products: Product[] = [];
  publishers: string[];
  authors: string[];
  originProducts = products;

  constructor(private storeServices: StoreService) { }

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

  trackByFn(index, item){
    return item.$key;
  }

  onSelectedProduct(productId): void{
    this.storeServices.setSelectedProductId(productId)
  }
  selectedProductId: string;
  handleSelectedProduct(productId: string): void {
    this.selectedProductId = productId;
  }

}
