import { Component, OnInit } from '@angular/core';
//import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { from } from 'rxjs';

import {Product} from 'src/app/shared/models/product';
import {products} from 'src/app/shared/mock-data/product-list';
import {ProductService} from 'src/app/services/product.service';
import { FormGroup, FormControl, Validator, Validators, FormBuilder, FormArray } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-reactiveformadmin',
  templateUrl: './reactiveformadmin.component.html',
  styleUrls: ['./reactiveformadmin.component.scss']
})
export class ReactiveformadminComponent implements OnInit {

  adminRF: FormGroup;

  postData = this.adminRF;

  json;

  url=`http://localhost:3000/productdb`;

  constructor(private fb: FormBuilder, private http: HttpClient) {
    this.http.post(this.url, this.postData).toPromise().then((data: any) =>{
      console.log(data);
      this.json = data.json;
    });
  }

  ngOnInit(): void {
    this.adminRF = this.fb.group({
      key: ['', [Validators.required, Validators.maxLength(3)]],
      title: ['', [Validators.required, Validators.maxLength(45)]],
      imageUrl: ['', [Validators.required]],
      author: this.fb.array([
        ['', [Validators.required, Validators.maxLength(30)]]
      ]),
      finalPrice: ['',[Validators.required]],
      regularPrice: ['', [Validators.required]],
      publisher: ['',[Validators.required, Validators.maxLength(30)]],
      publishedDate: ['',[Validators.required]],
      size: ['', [Validators.required]],
      pageCount: ['', [Validators.required]],
      isTikiNow: ['']
      // key: this.fb.control('', [Validators.required, Validators.minLength(3)]),
      // title: this.fb.control('', [Validators.required, Validators.minLength(45)]),
      // imageUrl: this.fb.control('', [Validators.required]),
      // author: this.fb.control('', [Validators.required, Validators.minLength(30)]),
      // finalPrice: this.fb.control('',[Validators.required]),
      // regularPrice: this.fb.control('', [Validators.required]),
      // publisher: this.fb.control('',[Validators.required, Validators.minLength(30)]),
      // publishedDate: this.fb.control('',[Validators.required]),
      // size: this.fb.control('', [Validators.required]),
      // pageCount: this.fb.control('', [Validators.required]),
      // isTikiNow: this.fb.control('', [Validators.required])
    });
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

  onSubmit(){
    console.log(this.adminRF);
  }

}
