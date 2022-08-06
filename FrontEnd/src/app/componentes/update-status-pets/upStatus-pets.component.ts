import { Component, OnInit } from '@angular/core';
import { Pets } from '../../model/pet';
import { ActivatedRoute, Router } from '@angular/router';
import { PetsService } from '../../service/pets.service';

@Component({
  selector: 'app-upStatus-pets',
  templateUrl: './upStatus-pets.component.html',
  styleUrls: ['./upStatus-pets.component.css']
})
export class UpdateStatusComponent implements OnInit {

 id!: number;
 pet!: Pets;
 subimited = false;

  constructor(private route: ActivatedRoute, private router: Router,
    private petsService: PetsService) { }

  ngOnInit() {
    this.pet = new Pets();

    this.id = this.route.snapshot.params['id'];

    this.petsService.getPet(this.id)
      .subscribe(data => {
        console.log(data)
        this.pet = data;
      }, error => console.log(error));
  }

  updateStatus() {
    this.petsService.updateStatus(this.id, this.pet)
      .subscribe(data => {
        console.log(data);
        this.pet = new Pets();
        this.gotoList();
      }, error => console.log(error));
  }

  onSubmit() {
    this.updateStatus();
  }

  gotoList() {
    this.router.navigate(['pets']);
  }
}
