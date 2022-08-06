/*import {PetsDetailsComponent } from '../details-pets/pets-details.component';*/
import { Observable } from 'rxjs';
import { PetsService } from './../../service/pets.service';
import { Pets } from './../../model/pet';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pets-ativos',
  templateUrl: './pets-list-ativos.component.html',
  styleUrls: ['./pets-list-ativos.component.css']
})
export class PetsListAtivosComponent implements OnInit {
  pets!: Observable<Pets[]>;

  constructor(private petsService: PetsService,
              private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.pets = this.petsService.getPetsListAtivos();
  }

  deletePet(id: number) {
    this.router.navigate(['delete' , id]);
  }

  petDetails(id: number){
    this.router.navigate(['details', id]);
  }

  updatePet(id: number){
    this.router.navigate(['update', id]);
  }
}
