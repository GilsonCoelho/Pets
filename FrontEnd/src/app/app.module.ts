import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { CreatePetsComponent } from './componentes/create-pets/create-pets.component';
import { PetsDetailsComponent } from './componentes/pets-details/pets-details.component';
import { PetsListComponent } from './componentes/pets-list/pets-list.component';
import { UpdatePetsComponent } from './componentes/update-pets/update-pets.component'; 
import { PetsService } from './service/pets.service';
import { PetsListAtivosComponent } from './componentes/list-ativos-pets/pets-list-ativos.component';
import { PetsListInativosComponent } from './componentes/list-inativos-pets/pets-list-inativos.component';
import { UpdateStatusComponent } from './componentes/update-status-pets/upStatus-pets.component';

@NgModule({
  declarations: [
    AppComponent,
    CreatePetsComponent,
    PetsDetailsComponent,
    PetsListComponent,
    PetsListAtivosComponent,
    PetsListInativosComponent,
    UpdateStatusComponent,    
    UpdatePetsComponent
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
