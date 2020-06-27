import { Component, OnInit } from '@angular/core';
import { products } from 'src/app/shared/mock-data/product-list';
import { MessengerService} from 'src/app/services/messenger.service';
import { ProductService } from 'src/app/services/product.service';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.scss']
})
export class AddProductComponent implements OnInit {

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

  pro=[]
  
  postData = this.product;
  json;

  url=`http://localhost:3000/productdb`;

  constructor(private msg2: MessengerService, private productService: ProductService, private http: HttpClient) {
    this.http.post(this.url, this.postData).toPromise().then((data: any) =>{
      console.log(data);
      this.json = data.json;
    });
   }

  ngOnInit(): void {
    // var StringifyData=JSON.stringify(this.product)
    // this.product.forEach((item, index)=>{
    //   var obj;
    //   obj={
    //     $key: item.productKey,

    //   }
    // })
  }

  onSubmit(formValue){
    console.log(formValue);
    this.addProduct(formValue);
  }

  sendData(){
    this.msg2.sendMsg(this.pro)
  }

  addProduct(p){
    this.productService.createProduct(p).subscribe();
  }
}
