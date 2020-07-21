import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormControl, Validator, Validators, FormBuilder, FormArray } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router} from '@angular/router';

import {Cards} from'src/app/models/cards';
import {CardsService} from 'src/app/services/cards.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  card: Cards;
  loginForm: FormGroup;
  loginM = 0;

  constructor(private http: HttpClient, private cardService: CardsService, private router: Router) {
    this.loginForm = new FormGroup({
      cardNo: new FormControl(),
      pin: new FormControl()
    });
    this.card ={
      cardNo: '',
      pin: ''
    }
   }

  ngOnInit(): void {
   
  }

  OnSubmit(){
    this.card.cardNo = this.loginForm.get('cardNo').value;
    this.card.pin = this.loginForm.get('pin').value;
    this.cardService.login(this.card.cardNo, this.card.pin).subscribe(
      res=>{
        if(res){
          this.router.navigateByUrl('localhost/8080/main');
        }else{
        }
      }
    );
    this.loginM +=1;
    if(this.loginM == 3){
      this.router.navigateByUrl('localhost/8080/**');
    }
  }
}
