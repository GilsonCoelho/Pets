import {GarantiaDetailsComponent } from '../details-pets/garantia-details.component';
import { Observable } from 'rxjs';
import { GarantiaService } from './../../service/garantia.service';
import { Garantia } from './../../model/garantia';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-garantia-list',
  templateUrl:'./garantia-list.component.html',
  styleUrls: ['./garantia-list.component.css']
})
export class GarantiaListComponent implements OnInit {
  garantias!: Observable<Garantia[]>;

  constructor(private garantiaService: GarantiaService,
              private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.garantias = this.garantiaService.getGarantiasList();
  }

  deleteGarantia(id: number) {
    this.router.navigate(['delete' , id]);
  }

  garantiaDetails(id: number){
    this.router.navigate(['details', id]);
  }

  updateGarantia(id: number){
    this.router.navigate(['update', id]);
  }

  
}
