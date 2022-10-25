import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SampleComponent } from './sample/sample.component';
import { HttpClientModule } from '@angular/common/http';
import { ProductNavigateComponent } from './app/comp/product-navigate/product-navigate.component';
import { PageNotFoundComponent } from './app/comp/page-not-found/page-not-found.component'

@NgModule({
  declarations: [
    AppComponent,
    SampleComponent,
    ProductNavigateComponent,
    PageNotFoundComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
