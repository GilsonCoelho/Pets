import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GarantiaListAtivosComponent } from './garantia-list-ativos.component';

describe('GarantiaListAtivosComponent', () => {
  let component: GarantiaListAtivosComponent;
  let fixture: ComponentFixture<GarantiaListAtivosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GarantiaListAtivosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GarantiaListAtivosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
