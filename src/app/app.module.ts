import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { PetsListComponent } from './componentes/list-pets/pets-list.component';
import { PetsDetailsComponent } from './componentes/details-pets/pets-details.component';
import { PetsListAtivosComponent } from './componentes/list-ativos-pets/pets-list-ativos.component';
import { PetsListInativosComponent } from './componentes/list-inativos-pets/pets-list-inativos.component';
import { UpdatePetsComponent } from './componentes/update-pets/update-pets.component';
import { UpdateStatusComponent } from './componentes/update-status-pets/upStatus-pets.component';
import { CreatePetsComponent } from './componentes/create-pets/create-pets.component';
import { PetsService } from './service/pets.service';


@NgModule({
  declarations: [
    AppComponent,
    PetsListComponent,
    PetsDetailsComponent,
    PetsListAtivosComponent,
    PetsListInativosComponent,
    UpdatePetsComponent,
    UpdateStatusComponent,
    CreatePetsComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [PetsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
