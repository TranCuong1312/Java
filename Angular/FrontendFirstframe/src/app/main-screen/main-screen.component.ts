import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main-screen',
  templateUrl: './main-screen.component.html',
  styleUrls: ['./main-screen.component.css']
})
export class MainScreenComponent implements OnInit {

  logo: string ="assets/img/Logo.png";
  button: string ="assets/img/button.png";

  constructor() { }

  ngOnInit(): void {
  }

}
