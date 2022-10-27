import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Message } from 'src/app/model/message';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-add-product-r',
  templateUrl: './add-product-r.component.html',
  styleUrls: ['./add-product-r.component.css']
})
export class AddProductRComponent implements OnInit {
  msg:Message;
  pdata=new FormGroup(
    {
      sku: new FormControl,
      name: new FormControl(),
      description: new FormControl(),
      unitPrice: new FormControl(),
      imageUrl: new FormControl(),
      active: new FormControl(),
      unitsInStock: new FormControl(),
      category:new FormGroup(
        {
          id:new FormControl()
        }
      )
    }
  );
  constructor(private ps:ProductService) { }

  ngOnInit(): void {
  }
  onSubmit(){
     const data1=JSON.stringify(this.pdata.value);
     this.ps.registerProduct(data1).subscribe(data=>{
      this.msg=data;
     // console.log(data);
    });

  }
}
