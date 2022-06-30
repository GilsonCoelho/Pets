import {PetsDetailsComponent } from '../details-pets/pets-details.component';
import { Observable } from 'rxjs';
import { PetsService } from './../../service/pets.service';
import { Pets } from './../../model/pet';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pets-inativos',
  templateUrl: './pets-list-inativos.component.html',
  styleUrls: ['./pets-list-inativos.component.css']
})
export class PetsListInativosComponent implements OnInit {
  pets!: Observable<Pets[]>;

  constructor(private petsService: PetsService,
              private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.pets = this.petsService.getPetsListInativos();
  }

  deletePets(id: number) {
    this.router.navigate(['delete' , id]);
  }

  petsDetails(id: number){
    this.router.navigate(['details', id]);
  }

  updatePets(id: number){
    this.router.navigate(['update', id]);
  }
}
