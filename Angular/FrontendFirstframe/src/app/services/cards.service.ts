import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';


import { Cards} from 'src/app/models/cards';
import { AutResponse } from '../models/aut-response';
import { map } from 'rxjs/operators';


export class Card{
  constructor(
    public status:string,
     ) {}
  
}
@Injectable({
  providedIn: 'root'
})
export class CardsService {
  baseUrl = 'localhost/8080';

  constructor(private http: HttpClient) { }

  GetCards(): Observable<Cards[]>{
    return this.http.get<Cards[]>(this.baseUrl);
  }

  Login(card: Cards): Observable<any>{
    return this.http.post<AutResponse>(this.baseUrl+'/login', card); 
  }

  login(cardNo, pin){
    const headers = new HttpHeaders({Authorization: 'Basic '+ btoa(cardNo + ':' + pin)});
    return this.http.get<Card>('http://localhost:8080/api/v1/login'+'/'+cardNo,{headers}).pipe(
      map(
        data=>{
          sessionStorage.setItem('cardNo', cardNo);
          return data;
        }
      )
    );
  }

 
}
