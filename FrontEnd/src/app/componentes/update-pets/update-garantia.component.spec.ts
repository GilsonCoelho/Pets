import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateGarantiaComponent } from './update-garantia.component';

describe('UpdateGarantiaComponent', () => {
  let component: UpdateGarantiaComponent;
  let fixture: ComponentFixture<UpdateGarantiaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateGarantiaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateGarantiaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
