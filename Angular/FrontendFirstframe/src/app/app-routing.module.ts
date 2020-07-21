import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HistoriesComponent } from './histories/histories.component';
import { FilterconditionsComponent } from './histories/filterconditions/filterconditions.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { MainScreenComponent } from './main-screen/main-screen.component';


const routes: Routes = [
  {
    path:"", component: LoginComponent
  },
  {
    path:"filterconditions", component: FilterconditionsComponent
  },
  {
    path:"histories", component: HistoriesComponent
  },{
    path: "main",
    component: MainScreenComponent
  },{
    path: '**',
    component: PageNotFoundComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
