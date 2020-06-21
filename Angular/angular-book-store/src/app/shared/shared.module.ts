import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { QuantityComponent } from './components/quantity/quantity.component';
import { PricePipe } from './pipes/price.pipe';
import { DiscountPipe } from './pipes/discount.pipe';
import { NorthPipe } from './pipes/north.pipe';



@NgModule({
  declarations: [QuantityComponent, PricePipe, DiscountPipe, NorthPipe],
  imports: [
    CommonModule
  ],
  exports: [QuantityComponent, PricePipe, DiscountPipe]
})
export class SharedModule { }
