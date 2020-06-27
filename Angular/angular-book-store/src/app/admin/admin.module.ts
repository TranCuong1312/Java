import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminProductListComponent } from './admin-product-list/admin-product-list.component';
import { AdminProductdetailComponent } from './admin-product-list/admin-productdetail/admin-productdetail.component';
import { SharedModule } from 'src/app/shared/shared.module';
import { AdminProductDetailOfAthourComponent } from './admin-product-detail-of-athour/admin-product-detail-of-athour.component';
import { AddProductComponent } from './add-product/add-product.component';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { ReactiveformadminComponent } from './reactiveformadmin/reactiveformadmin.component';
import { HttpClientModule} from '@angular/common/http';



@NgModule({
  declarations: [AdminProductListComponent, AdminProductdetailComponent, AdminProductDetailOfAthourComponent, AddProductComponent, ReactiveformadminComponent],
  imports: [
    CommonModule, SharedModule, FormsModule, ReactiveFormsModule, HttpClientModule
  ],
  exports: [
    AdminProductListComponent,
    AdminProductdetailComponent
  ]
})
export class AdminModule { }
