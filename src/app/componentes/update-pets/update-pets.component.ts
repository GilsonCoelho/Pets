import { Component, OnInit } from '@angular/core';
import { Pets } from '../../model/pet';
import { ActivatedRoute, Router } from '@angular/router';
import { PetsService } from '../../service/pets.service';

@Component({
  selector: 'app-update-pets',
  templateUrl: './update-pets.component.html',
  styleUrls: ['./update-pets.component.css']
})
export class UpdatePetsComponent implements OnInit {

 id!: number;
 pet!: Pets;
 subimited = false;

  constructor(private route: ActivatedRoute, private router: Router,
    private petsService: PetsService) { }

  ngOnInit() {
    this.pet = new Pets();

    this.id = this.route.snapshot.params['id'];

    this.petsService.getPets(this.id)
      .subscribe(data => {
        console.log(data)
        this.pet = data;
      }, error => console.log(error));
  }

  updatePets() {
    this.petsService.updatePets(this.id, this.pet)
      .subscribe(data => {
        console.log(data);
        this.pet = new Pets();
        this.gotoList();
      }, error => console.log(error));
  }

  onSubmit() {
    this.updatePets();
  }

  gotoList() {
    this.router.navigate(['pet']);
  }
}
