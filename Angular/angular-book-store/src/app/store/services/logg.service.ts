import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoggService {

  constructor() { }

  logConsole(msg){
    console.log(msg);
  }

}
