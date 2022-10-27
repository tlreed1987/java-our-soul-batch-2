import { Component, OnInit } from '@angular/core';
import { Message } from 'src/app/model/message';
import { ProductCategory } from 'src/app/model/product-category';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
  pc:ProductCategory[];
  msg:Message;
  constructor(private ps:ProductService) { }

  ngOnInit(): void {
    this.ps.findAllCategories().subscribe(data=>{
      this.pc=data;
    });
  }
  
  onSubmit(pdata:any){
      const data1=JSON.stringify(pdata.value);
      console.log(1);
      this.ps.registerProduct(data1).subscribe(data=>{
        this.msg=data;
       // console.log(data);
      });
     // how to go back to home page
     //or redirect to other component that shows message about success
  }
}
