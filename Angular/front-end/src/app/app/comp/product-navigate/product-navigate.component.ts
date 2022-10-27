import { Component, OnInit } from '@angular/core';
import { ProductCategory } from 'src/app/model/product-category';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-product-navigate',
  templateUrl: './product-navigate.component.html',
  styleUrls: ['./product-navigate.component.css']
})
export class ProductNavigateComponent implements OnInit {
  prodCategory:ProductCategory[];
  constructor(private ps:ProductService) { }

  ngOnInit(): void {
      this.ps.findAllCategories().subscribe(data=>{
          this.prodCategory=data;
      });
  }

}
