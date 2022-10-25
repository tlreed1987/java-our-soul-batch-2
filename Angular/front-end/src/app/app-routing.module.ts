import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageNotFoundComponent } from './app/comp/page-not-found/page-not-found.component';
import { SampleComponent } from './sample/sample.component';

const routes: Routes = [
    {path:'category/:cid', component:SampleComponent},
    {path:'home', component:SampleComponent},
    {path:'', redirectTo:'home', pathMatch:'full'},
    {path:'**', component:PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
