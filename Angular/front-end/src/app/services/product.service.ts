import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Message } from '../model/message';
import { Product } from '../model/product';
import { ProductCategory } from '../model/product-category';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  baseURI="http://localhost:8080/products";
  customeURI="http://localhost:8080/api/products";
  categoryURI="http://localhost:8080/api/categories";
  headers= new HttpHeaders( {
    "Content-Type":"application/json"
  });

  constructor(private http:HttpClient) { }

  findAllProducts(cid:number):Observable<Product[]>{
      const url=`${this.baseURI}/search/findProductByCategoryId?categoryId=${cid}`;
      const req=this.http.get<ProductResponse>(url);
      return req.pipe(map(data=>data._embedded.products));

  }

  findAllCategories():Observable<ProductCategory[]>{
    return this.http.get<ProductCategory[]>(this.categoryURI);
  }

  registerProduct(product:any):Observable<Message>{
      console.log(product);
      return this.http.post<Message>(this.customeURI,product,{headers:this.headers});
        
  }
}


interface ProductResponse{
  _embedded:{
    products:Product[]
  }

}
