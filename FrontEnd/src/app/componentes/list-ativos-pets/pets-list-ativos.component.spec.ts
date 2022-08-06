import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PetsListAtivosComponent } from './pets-list-ativos.component';

describe('PetsListAtivosComponent', () => {
  let component: PetsListAtivosComponent;
  let fixture: ComponentFixture<PetsListAtivosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PetsListAtivosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PetsListAtivosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
