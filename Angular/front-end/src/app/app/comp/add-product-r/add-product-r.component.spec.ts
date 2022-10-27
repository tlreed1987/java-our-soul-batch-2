import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddProductRComponent } from './add-product-r.component';

describe('AddProductRComponent', () => {
  let component: AddProductRComponent;
  let fixture: ComponentFixture<AddProductRComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddProductRComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddProductRComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
