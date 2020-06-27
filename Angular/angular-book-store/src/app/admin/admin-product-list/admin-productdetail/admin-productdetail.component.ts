import { Component, OnInit, Input } from '@angular/core';
import { Product } from 'src/app/shared/models/product';
import { MessengerService} from 'src/app/services/messenger.service';
import { AddProductComponent} from 'src/app/admin/add-product/add-product.component';

@Component({
  selector: 'app-admin-productdetail',
  templateUrl: './admin-productdetail.component.html',
  styleUrls: ['./admin-productdetail.component.scss']
})
export class AdminProductdetailComponent implements OnInit {

  display= true;

  @Input() product: Product;

  constructor(private msg: MessengerService) { }
  
  productDetail=[]

  ngOnInit(): void {
    this.msg.getMsg().subscribe((product: AddProductComponent) =>{
      console.log(product)
      this.productDetail.push({//fail in here, it keep pushing everytime we hit the but
        // keyDetail : product.productKey,
        // titleDetail : product.title,
        // imageUrlDetail : product.imageUrl,
        // authorDetail : product.author,
        // finalPriceDetail : product.finalPrice,
        // regularPriceDetail : product.regularPrice,
        // publisherDetail : product.publisher,
        // publishedDateDetail : product.publishedDate,
        // sizeDetail : product.size,
        // pageCountDetail : product.pageCount,
        // isTikiNowDetail : product.isTikiNow 
      })
      
    })
  }

  handleDisplayDetail(){
    this.msg.sendMsg(this.product)
  }

  displayDiscount(){
    if(this.display = true){
      this.display = false;
    }
    if(this.display= false){
      this.display = true;
    }
  }
}
