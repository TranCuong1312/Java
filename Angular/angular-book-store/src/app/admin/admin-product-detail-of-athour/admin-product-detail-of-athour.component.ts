import { Component, OnInit } from '@angular/core';
import { MessengerService} from 'src/app/services/messenger.service';
import { Product } from 'src/app/shared/models/product';

@Component({
  selector: 'app-admin-product-detail-of-athour',
  templateUrl: './admin-product-detail-of-athour.component.html',
  styleUrls: ['./admin-product-detail-of-athour.component.scss']
})
export class AdminProductDetailOfAthourComponent implements OnInit {

  

  productDetail=[]

  constructor(private msg: MessengerService) { }

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
  }

}
