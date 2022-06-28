import {PetsService } from '../../service/pets.service';
import { Pets } from '../../model/pets';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-pets',
  templateUrl: './create-pets.component.html',
  styleUrls: ['./create-pets.component.css']
})
export class CreatePetsComponent implements OnInit {

  pets: Pets = new Pets();
  submitted = false;

  constructor(private petsService: PetsService,
              private router: Router) { }

  ngOnInit() {
  }

  newPets(): void {
    this.submitted = false;
    this.pets = new Pets();
  }

  save() {
    this.petsService
    .createPets(this.pets).subscribe(data => {
      console.log(data)
      this.pets = new Pets();
      this.gotoList();
    }, 
    error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(['pets']);
  }
}