import {PetsService } from '../../service/pets.service';
import { Pets } from '../../model/pet';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-pets',
  templateUrl: './create-pets.component.html',
  styleUrls: ['./create-pets.component.css']
})
export class CreatePetsComponent implements OnInit {

  pet: Pets = new Pets();
  submitted = false;

  constructor(private petsService: PetsService,
              private router: Router) { }

  ngOnInit() {
  }

  newPets(): void {
    this.submitted = false;
    this.pet = new Pets();
  }

  save() {
    this.petsService
    .createPets(this.pet).subscribe(data => {
      console.log(data)
      this.pet = new Pets();
      this.gotoList();
    }, 
    error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(['pet']);
  }
}