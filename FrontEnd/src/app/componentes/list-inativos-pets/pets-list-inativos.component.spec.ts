import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PetsListInativosComponent } from './pets-list-inativos.component';

describe('PetsListInativosComponent', () => {
  let component: PetsListInativosComponent;
  let fixture: ComponentFixture<PetsListInativosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PetsListInativosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PetsListInativosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
