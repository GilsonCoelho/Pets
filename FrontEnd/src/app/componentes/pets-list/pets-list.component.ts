import {PetsDetailsComponent} from './../pets-details/pets-details.component';
import { Observable } from 'rxjs';
import { PetsService } from './../../service/pets.service';
import { Pets } from './../../model/pet';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pets-list',
  templateUrl: './pets-list.component.html',
  styleUrls: ['./pets-list.component.css']
})
export class PetsListComponent implements OnInit {
  
  pets!: Observable<Pets[]>;


  constructor(private petsService: PetsService,
              private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.pets = this.petsService.getPetsList();
  }

  deletePet(id: number) {    
    this.petsService.deletePet(id).subscribe(
      data =>{
        console.log(data);
        this.reloadData;
      },
      error => console.log(error));
  }

  getPet(id: number){
    this.router.navigate(['details', id]);
  }

  updatePet(id: number){
    this.router.navigate(['update', id]);
  }

  
}
