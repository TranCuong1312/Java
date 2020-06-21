import { Component, OnInit, Input, ViewEncapsulation } from '@angular/core';

@Component({
  selector: 'app-product-sidebar',
  templateUrl: './product-sidebar.component.html',
  styleUrls: ['./product-sidebar.component.scss'],
  encapsulation: ViewEncapsulation.Emulated
})
export class ProductSidebarComponent implements OnInit {
  @Input() publishers: string[];
  @Input() authors: string[];

  redyellow="'border-red background-yellow'";
  style="background-color: royalblue";
  isEnableClass = true;

  constructor() { }

  ngOnInit(): void {
  }

}
