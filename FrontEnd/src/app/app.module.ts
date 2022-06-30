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


@NgModule({
  declarations: [
    AppComponent,
    CreatePetsComponent,
    PetsDetailsComponent,
    PetsListComponent,    
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
