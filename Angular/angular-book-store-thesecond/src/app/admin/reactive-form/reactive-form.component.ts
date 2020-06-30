import { Component, OnInit, Input } from '@angular/core';
import { from } from 'rxjs';

import {Product} from 'src/app/shared/models/product';
import {products} from 'src/app/shared/mock-data/product-list';
import {ProductService} from 'src/app/services/product.service';
import { FormGroup, FormControl, Validator, Validators, FormBuilder, FormArray } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.scss']
})
export class ReactiveFormComponent implements OnInit {

  @Input() product: Product;
  adminRF: FormGroup;
  postData = this.adminRF;

  constructor(private fb: FormBuilder, private http: HttpClient, private productService: ProductService) { }

  ngOnInit(): void {
    this.adminRF = this.fb.group({
      id: [this.product.id],
      title: [this.product.title, [Validators.required, Validators.maxLength(45)]],
      imageUrl: [this.product.imageUrl, [Validators.required]],
      author: this.fb.array([
        [this.product.author, [Validators.required, Validators.maxLength(30)]]
      ]),
      finalPrice: [this.product.finalPrice,[Validators.required]],
      regularPrice: [this.product.regularPrice, [Validators.required]],
      publisher: [this.product.publisher,[Validators.required, Validators.maxLength(30)]],
      publishedDate: [this.product.publishedDate,[Validators.required]],
      size: [this.product.size, [Validators.required]],
      pageCount: [this.product.pageCount, [Validators.required]],
      isTikiNow: [this.product.isTikiNow]
    });
  }

  onSubmit(){
    console.log(this.adminRF);
  }

  updateSubmit(){
    
  }

  get author(): FormArray {
    return this.adminRF.get('author') as FormArray;
  }

  addAuthor(){
    this.author.push(this.fb.control('',[Validators.required, Validators.minLength(30)]));
  }

  removeAuthor(index: number){
    this.author.removeAt(index);
  }


}
