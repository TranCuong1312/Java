import { Injectable } from '@angular/core';
import { Product } from 'src/app/shared/models/product';
import { HttpClient, HttpErrorResponse} from '@angular/common/http';
import { map, catchError } from 'rxjs/operators';
import { from, throwError, Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products: Product[] = [
  ];

  constructor(private http: HttpClient) { }

  createProduct(product: Product){
    return this.http.post('https://angular-book-store-d1bc5.firebaseio.com/product.json', product).pipe(catchError(this.handleError));
  }

  getProducts(){
    return this.http.get('https://angular-book-store-d1bc5.firebaseio.com/product.json').pipe(
      map(data => {
        const products: Product[] = [];
        for (const key in data){
          if(data.hasOwnProperty(key)){
            products.push(new Product({...data[key], id: key}));
          }
        }
        return products;
      })
    );
  }

  private handleError(error: HttpErrorResponse){
    if(error.error instanceof ErrorEvent){
      console.error('An error occurred', error.error.message);
    } else {
      console.error(
        'Backend returned code ${error.status},' +
        'body was: ${error.error}'
      );
    }
    return throwError('Somrthing wrong');
  }

  updateProduct(product: Product){
    const pip = product.id;
    delete product.id;
    return this.http.post(`https://angular-book-store-d1bc5.firebaseio.com/product/${pip}.json`,product).pipe(
      catchError(this.handleError));
  }

  deleteProduct(pid) {
    return this.http.delete(`https://angular-book-store-d1bc5.firebaseio.com/product/${pid}.json`);
  }

  getProductById(pid): Observable<Product> {
    return this.http.get(`https://angular-book-store-d1bc5.firebaseio.com/product/${pid}.json`).pipe(
      map(result => ({ ...new Product(result), id: pid}))
    );
  }
}
