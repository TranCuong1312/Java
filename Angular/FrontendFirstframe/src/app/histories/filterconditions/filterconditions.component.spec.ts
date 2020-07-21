import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FilterconditionsComponent } from './filterconditions.component';

describe('FilterconditionsComponent', () => {
  let component: FilterconditionsComponent;
  let fixture: ComponentFixture<FilterconditionsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FilterconditionsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FilterconditionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
