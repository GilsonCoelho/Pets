import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GarantiaListComponent } from './garantia-list.component';

describe('GarantiaListComponent', () => {
  let component: GarantiaListComponent;
  let fixture: ComponentFixture<GarantiaListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GarantiaListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GarantiaListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
