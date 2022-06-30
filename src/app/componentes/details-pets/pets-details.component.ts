import { Pets } from '../../model/pet';
import { Component, OnInit, Input } from '@angular/core';
import { PetsService } from '../../service/pets.service';
import { PetsListComponent } from '../list-pets/pets-list.component';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-pets-details',
  templateUrl: './pets-details.component.html',
  styleUrls: ['./pets-details.component.css']
})
export class PetsDetailsComponent implements OnInit {

  id!: number;
  pet!: Pets;

  constructor(private route: ActivatedRoute,private router: Router,
              private petsService: PetsService) { }

  ngOnInit() {
    this.pet = new Pets();

    // tslint:disable-next-line:no-string-literal
    this.id = this.route.snapshot.params['id'];
    
    this.petsService.getPets(this.id)
      .subscribe(data => {
        console.log(data)
        this.pet = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['pet']);
  }
}
