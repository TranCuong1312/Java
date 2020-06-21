import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminProductDetailOfAthourComponent } from './admin-product-detail-of-athour.component';

describe('AdminProductDetailOfAthourComponent', () => {
  let component: AdminProductDetailOfAthourComponent;
  let fixture: ComponentFixture<AdminProductDetailOfAthourComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminProductDetailOfAthourComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminProductDetailOfAthourComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
