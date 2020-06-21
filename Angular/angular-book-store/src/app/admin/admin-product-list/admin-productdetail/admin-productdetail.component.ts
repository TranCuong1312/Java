import { Component, OnInit, Input } from '@angular/core';
import { Product } from 'src/app/shared/models/product';
import { MessengerService} from 'src/app/services/messenger.service';

@Component({
  selector: 'app-admin-productdetail',
  templateUrl: './admin-productdetail.component.html',
  styleUrls: ['./admin-productdetail.component.scss']
})
export class AdminProductdetailComponent implements OnInit {

  display= false;

  @Input() product: Product;

  constructor(private msg: MessengerService) { }

  ngOnInit(): void {
  }

  handleDisplayDetail(){
    this.msg.sendMsg(this.product)
  }

  displayDiscount(){
    this.display= true;
  }
}
