import {GarantiaDetailsComponent } from '../details-pets/garantia-details.component';
import { Observable } from 'rxjs';
import { GarantiaService } from './../../service/garantia.service';
import { Garantia } from './../../model/garantia';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-garantia-ativos',
  templateUrl: './garantia-list-ativos.component.html',
  styleUrls: ['./garantia-list-ativos.component.css']
})
export class GarantiaListAtivosComponent implements OnInit {
  garantias!: Observable<Garantia[]>;

  constructor(private garantiaService: GarantiaService,
              private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.garantias = this.garantiaService.getGarantiasListAtivos();
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
