import { Component, OnInit, OnChanges, Input } from '@angular/core';
import { MessengerService} from 'src/app/services/messenger.service';
import { Product } from 'src/app/shared/models/product';
import { StoreService} from 'src/app/store/services/store.service';
import { products } from 'src/app/shared/mock-data/product-list';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-admin-product-detail-of-athour',
  templateUrl: './admin-product-detail-of-athour.component.html',
  styleUrls: ['./admin-product-detail-of-athour.component.scss']
})
export class AdminProductDetailOfAthourComponent implements OnInit {
  @Input() productID: string;
  product: Product;
  

  productDetail=[]

  url=`http://localhost:3000/productdb`;

  constructor(private msg: MessengerService, private http: HttpClient) {
    this.http.get(this.url).toPromise().then(data=>{
      console.log(data);
      
      for( let key in data)
        if(data.hasOwnProperty(key))
        this.productDetail.push(data[key]);
    });
   }

  // ngOnChanges(productId: {previousValue, currentValue, firstChange}) {
  //   this.product = products.find(ele => ele.$key === this.productID);
  // }

  ngOnInit(): void {
    this.msg.getMsg().subscribe((product: Product) =>{
      console.log(product)
      this.productDetail.push({//fail in here, it keep pushing everytime we hit the but
        keyDetail : product.$key,
        titleDetail : product.title,
        imageUrlDetail : product.imageUrl,
        authorDetail : product.author,
        finalPriceDetail : product.finalPrice,
        regularPriceDetail : product.regularPrice,
        publisherDetail : product.publisher,
        publishedDateDetail : product.publishedDate,
        sizeDetail : product.size,
        pageCountDetail : product.pageCount,
        isTikiNowDetail : product.isTikiNow 
      })
      
    })
      // this.productDetail.push ({//fail in here, it keep pushing everytime we hit the but
      //   keyDetail : product.$key,
      //   titleDetail : product.title,
      //   imageUrlDetail : product.imageUrl,
      //   authorDetail : product.author,
      //   finalPriceDetail : product.finalPrice,
      //   regularPriceDetail : product.regularPrice,
      //   publisherDetail : product.publisher,
      //   publishedDateDetail : product.publishedDate,
      //   sizeDetail : product.size,
      //   pageCountDetail : product.pageCount,
      //   isTikiNowDetail : product.isTikiNow 
      // })
      
  }

}
