import { Component, ViewChild } from '@angular/core';
import { ProductListComponent } from './store/product-list/product-list.component';
import { AuthService } from './shared/services/auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})

export class AppComponent {
  selectedProductId: string;

  constructor(private authService: AuthService) {
    authService.refreshToken();
  }

  handleSelectedProduct(productId: string): void {
    this.selectedProductId = productId;
  }

  handleYesConfirm() {
    console.log('btn Yes was clicked!');
  }
  //Angular complete project !important
  //Observables ???? asynchronouns data streams dealing
  //map 
  //debounceTime() "for search, really useful"
  //merge: tron data
  //RxJs all, for merge
  //Subjects, have 3 kinds(): Behavior, Replay, Async 
  //Http 

  
}
