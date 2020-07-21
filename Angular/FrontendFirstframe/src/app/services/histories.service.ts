import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Histories } from '../models/histories';


@Injectable({
  providedIn: 'root'
})
export class HistoriesService {

  private baseUrl = 'localhost/8080/histories';
  private baseUrlPaging = `${this.baseUrl}\\???`;
  private createHisUrl =`${this.baseUrl}\\withdraw\\`;

  constructor(private http: HttpClient) { }

  CreateHistory(history: Histories): Observable<any>{
    return this.http.post<Histories[]>(this.createHisUrl, history);
  }

  GetHistories() : Observable<Histories[]>{
    return this.http.get<Histories[]>(this.baseUrl);
  }

  
}
