import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule, PreloadAllModules } from '@angular/router';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { ProductListComponent } from './product-list/product-list.component';

const routes: Routes = [
  {
    path: '',
    component: ProductListComponent
  },
  {
    path: 'product/:pid',
    component: ProductDetailComponent
  },
  // {
  //   path: 'cart',
  //   //component: ShoppingCartComponent,
  //   //canActivate: [AuthGuard]
  // },
  // {
  //   path: 'shipping',
  //   //component: ShippingFormComponent,
  //   //canActivate: [AuthGuard]
  // },
  // {
  //   path: 'checkout',
  //   //component: CheckOutComponent,
  //   //canActivate: [AuthGuard]
  // },
  // {
  //   path: 'order-success',
  //   //component: OrderSuccessComponent,
  //   //canActivate: [AuthGuard]
  // },
  // {
  //   path: 'my-orders',
  //   //component: MyOrdersComponent,
  //   //canActivate: [AuthGuard]
  // },
  // {
  //   path: 'my-favorites',
  //   //component: MyFavoritesComponent,
  //   //canActivate: [AuthGuard]
  // }
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule, RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})
export class StoreRoutingModule { }
