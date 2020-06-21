import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminProductListComponent } from './admin-product-list/admin-product-list.component';
import { AdminProductdetailComponent } from './admin-product-list/admin-productdetail/admin-productdetail.component';
import { SharedModule } from 'src/app/shared/shared.module';
import { AdminProductDetailOfAthourComponent } from './admin-product-detail-of-athour/admin-product-detail-of-athour.component';



@NgModule({
  declarations: [AdminProductListComponent, AdminProductdetailComponent, AdminProductDetailOfAthourComponent],
  imports: [
    CommonModule, SharedModule
  ],
  exports: [
    AdminProductListComponent,
    AdminProductdetailComponent
  ]
})
export class AdminModule { }
