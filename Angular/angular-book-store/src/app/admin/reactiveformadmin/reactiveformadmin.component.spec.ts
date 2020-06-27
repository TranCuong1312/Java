import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReactiveformadminComponent } from './reactiveformadmin.component';

describe('ReactiveformadminComponent', () => {
  let component: ReactiveformadminComponent;
  let fixture: ComponentFixture<ReactiveformadminComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReactiveformadminComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReactiveformadminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
