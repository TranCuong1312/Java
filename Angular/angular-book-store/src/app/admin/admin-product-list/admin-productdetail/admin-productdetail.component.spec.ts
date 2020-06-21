import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminProductdetailComponent } from './admin-productdetail.component';

describe('AdminProductdetailComponent', () => {
  let component: AdminProductdetailComponent;
  let fixture: ComponentFixture<AdminProductdetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminProductdetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminProductdetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
