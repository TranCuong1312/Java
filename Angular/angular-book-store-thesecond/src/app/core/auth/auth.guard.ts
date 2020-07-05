import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthService} from 'src/app/shared/services/auth.service';
import { AppUser } from 'src/app/shared/models/app-user';
import { users } from 'src/app/shared/mock-data/user-list';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  users: AppUser[] = users;
  canActivate(): boolean {
    if(this.authService.isAdmin(users)){
      this.router.navigate(['/admin']);
      return true;
    }else if(this.authService.login(users)){
      this.router.navigate(['/store']);
      return true;
    }else{
      this.router.navigate(['/store']);
    }
  }
  
  constructor(private authService: AuthService, private router: Router){
  }

}
