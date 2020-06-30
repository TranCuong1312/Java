import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule} from '@angular/forms';

import { SharedModule } from '../shared/shared.module';
import { AdminProductComponent } from 'src/app/admin/admin-product/admin-product.component';
import { AdminProductItemComponent } from './admin-product/admin-product-item/admin-product-item.component';
import { AdminProductDetailComponent } from 'src/app/admin/admin-product-detail/admin-product-detail.component';
import { TemplateFormComponent } from './template-form/template-form.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';



@NgModule({
  declarations: [
    AdminProductComponent, 
    AdminProductItemComponent, 
    AdminProductDetailComponent, TemplateFormComponent, ReactiveFormComponent],
  imports: [
    CommonModule, FormsModule, SharedModule,  ReactiveFormsModule
  ],
  exports: [
    AdminProductComponent,
    AdminProductDetailComponent
  ]
})
export class AdminModule { }
