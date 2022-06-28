import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GarantiaDetailsComponent } from './garantia-details.component';

describe('GarantiaDetailsComponent', () => {
  let component: GarantiaDetailsComponent;
  let fixture: ComponentFixture<GarantiaDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GarantiaDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GarantiaDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
