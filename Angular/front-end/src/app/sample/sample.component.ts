import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route } from '@angular/router';
import { Employee } from '../model/employee';
import { Product } from '../model/product';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-sample',
  templateUrl: './sample.component.html',
  styleUrls: ['./sample.component.css']
})
export class SampleComponent implements OnInit {
  products:Product[];
  
  
  constructor(private ps:ProductService,private route:ActivatedRoute)  { }

  ngOnInit(): void {
    this.route.params.subscribe(()=>
      {
        let cid=+this.route.snapshot.paramMap.get("cid");
        if(cid==0){
          cid=1;
        }
        this.findProduct(cid);
      }
    );
    
     
  }

  findProduct(cid:number){
    this.ps.findAllProducts(cid).subscribe(
      data=>{ this.products=data }
    );

  }

}
