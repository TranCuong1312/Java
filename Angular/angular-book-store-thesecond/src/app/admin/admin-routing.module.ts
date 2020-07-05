import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule, PreloadAllModules } from '@angular/router';
import { AdminProductComponent } from './admin-product/admin-product.component';
import {AdminProductDetailComponent} from 'src/app/admin/admin-product-detail/admin-product-detail.component';
import {ReactiveFormComponent} from 'src/app/admin/reactive-form/reactive-form.component';
import { ReactiveFormsModule } from '@angular/forms';

const routes: Routes = [
  {
    path: '',
    component: AdminProductComponent
  },
  // {
  //   path: 'product/new',
  //   component: AdminProductFormComponent,
  //   canDeactivate: [CanDeactivateGuard]
  // },
   {
    path: 'product/:pid',
    component: AdminProductDetailComponent
  },
  {
    path: 'product/:pid/edit',
    component: ReactiveFormComponent
  }
  // {
  //   path: 'product/:pid/edit',
  //   component: AdminProductReactiveFormComponent,
  //   canDeactivate: [CanDeactivateGuard]
  // },
  // {
  //   path: 'orders',
  //   component: AdminOrderComponent
  // }
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})
export class AdminRoutingModule { }
