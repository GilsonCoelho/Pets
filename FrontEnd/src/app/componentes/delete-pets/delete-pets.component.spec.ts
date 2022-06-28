import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteGarantiaComponent } from './delete-pets.component';

describe('DeleteGarantiaComponent', () => {
  let component: DeleteGarantiaComponent;
  let fixture: ComponentFixture<DeleteGarantiaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeleteGarantiaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeleteGarantiaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
