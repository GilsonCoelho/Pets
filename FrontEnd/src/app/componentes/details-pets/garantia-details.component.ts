import { Garantia } from '../../model/garantia';
import { Component, OnInit, Input } from '@angular/core';
import { GarantiaService } from '../../service/garantia.service';
import { GarantiaListComponent } from '../list-pets/garantia-list.component';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-garantia-details',
  templateUrl: './garantia-details.component.html',
  styleUrls: ['./garantia-details.component.css']
})
export class GarantiaDetailsComponent implements OnInit {

  id!: number;
  garantia!: Garantia;

  constructor(private route: ActivatedRoute,private router: Router,
              private garantiaService: GarantiaService) { }

  ngOnInit() {
    this.garantia = new Garantia();

    // tslint:disable-next-line:no-string-literal
    this.id = this.route.snapshot.params['id'];
    
    this.garantiaService.getGarantia(this.id)
      .subscribe(data => {
        console.log(data)
        this.garantia = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['garantias']);
  }
}
