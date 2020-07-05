import { Component, OnInit, Input } from '@angular/core';
import { products } from 'src/app/shared/mock-data/product-list';
import { Product } from 'src/app/shared/models/product';
import { StoreService } from 'src/app/store/services/store.service';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { switchMap, map } from 'rxjs/operators';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-admin-view-detail',
  templateUrl: './admin-view-detail.component.html',
  styleUrls: ['./admin-view-detail.component.scss']
})
export class AdminViewDetailComponent implements OnInit {

  product: Product;
  isFetching = true;

  constructor(private storeService: StoreService,  private route: ActivatedRoute, private location: Location, private productService: ProductService) { }

  ngOnInit(): void {
    this.route.params.pipe(
      map(params => params.pid),
      switchMap(pid => this.productService.getProductById(pid))
    ).subscribe(product =>{
      this.isFetching = false;
      this.product = product;
    });
  }

  goBack(): void {
    this.location.back();
  }

}
