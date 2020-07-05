import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminViewDetailComponent } from './admin-view-detail.component';

describe('AdminViewDetailComponent', () => {
  let component: AdminViewDetailComponent;
  let fixture: ComponentFixture<AdminViewDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminViewDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminViewDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
