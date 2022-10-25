import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  baseURI="http://localhost:8080/products";

  constructor(private http:HttpClient) { }

  findAllProducts(cid:number):Observable<Product[]>{
      const url=`${this.baseURI}/search/findProductByCategoryId?categoryId=${cid}`;
      console.log(url);
      const req=this.http.get<ProductResponse>(url);
      return req.pipe(map(data=>data._embedded.products));

  }
}


interface ProductResponse{
  _embedded:{
    products:Product[]
  }

}
