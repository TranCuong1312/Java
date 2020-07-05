import { Injectable } from '@angular/core';
import { BehaviorSubject, of } from 'rxjs';
import { AppUser } from '../models/app-user';
import { users } from 'src/app/shared/mock-data/user-list';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private isLoggedInUser = new BehaviorSubject<boolean>(false);
  $isLoggedInUser = this.isLoggedInUser.asObservable();

  users: AppUser[] = users;

  constructor() { }

  isAdmin(user){
    const adminLogged = this.users.find(u => user.email === u.email && user.password === u.password && u.isAdmin === true);
    if(adminLogged){
      const returnAdmin = {...adminLogged};
      delete returnAdmin.password;
      localStorage.setItem('currentUser', JSON.stringify(returnAdmin));
      this.isLoggedInUser.next(true);
      return of(true);
    }else{
      this.isLoggedInUser.next(false);
      return of(false);
    }
  }

  login(user) {
    const loggedInUser = this.users.find(u => user.email === u.email && user.password === u.password);

    if (loggedInUser) {
      const returnUser = { ...loggedInUser };
      delete returnUser.password;
      localStorage.setItem('currentUser', JSON.stringify(returnUser));
      this.isLoggedInUser.next(true);
      return of(true);
    } else {
      this.isLoggedInUser.next(false);
      return of(false);
    }
  }

  get appUser(): AppUser {
    return JSON.parse(localStorage.getItem('currentUser'));
  }

  refreshToken() {
    if (this.appUser) {
      this.isLoggedInUser.next(true);
    }
  }

  logout() {
    this.isLoggedInUser.next(false);
    localStorage.removeItem('currentUser');
  }
}
