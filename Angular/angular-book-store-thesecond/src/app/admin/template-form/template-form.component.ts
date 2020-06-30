import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/services/product.service';
import { HttpClient } from '@angular/common/http';
import { Product} from 'src/app/shared/models/product';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-template-form',
  templateUrl: './template-form.component.html',
  styleUrls: ['./template-form.component.scss']
})
export class TemplateFormComponent implements OnInit {
  subcription: Subscription;
  product = {
    "productAuthor": "",
    "productFinalPrice": "",
    "productImageUrl": "",
    "productKey": "",
    "productPageCount": "",
    "productPublishedDate": "",
    "productPublisher": "",
    "productRegularPrice": "",
    "productSize": "",
    "productTitle": "",
    "productisTikiNow": ""
  }

  constructor( private http: HttpClient, private productService: ProductService) { }

  ngOnInit(): void {
  }

  onSubmit(formValue){
    const product = formValue;
    this.subcription = this.productService.createProduct(product).subscribe(result => console.log(result));
  }

  addProduct(product){
    this.productService.createProduct(product).subscribe();
  }

  createProduct(product){
    this.productService.createProduct(product).subscribe();
  }

  deleteProduct(product: Product){
    const res = confirm('Are you sure you want to delete?');
    if (res) {
      this.productService.deleteProduct(product.id).subscribe(result => console.log(result));
    }
  }

}
