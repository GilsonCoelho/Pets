import { Component, OnInit } from '@angular/core';
import { Garantia } from '../../model/garantia';
import { ActivatedRoute, Router } from '@angular/router';
import { GarantiaService } from '../../service/garantia.service';

@Component({
  selector: 'app-update-garantia',
  templateUrl: './update-garantia.component.html',
  styleUrls: ['./update-garantia.component.css']
})
export class UpdateGarantiaComponent implements OnInit {

 id!: number;
 garantia!: Garantia;
 subimited = false;

  constructor(private route: ActivatedRoute, private router: Router,
    private garantiaService: GarantiaService) { }

  ngOnInit() {
    this.garantia = new Garantia();

    this.id = this.route.snapshot.params['id'];

    this.garantiaService.getGarantia(this.id)
      .subscribe(data => {
        console.log(data)
        this.garantia = data;
      }, error => console.log(error));
  }

  updateGarantia() {
    this.garantiaService.updateGarantia(this.id, this.garantia)
      .subscribe(data => {
        console.log(data);
        this.garantia = new Garantia();
        this.gotoList();
      }, error => console.log(error));
  }

  onSubmit() {
    this.updateGarantia();
  }

  gotoList() {
    this.router.navigate(['garantias']);
  }
}
