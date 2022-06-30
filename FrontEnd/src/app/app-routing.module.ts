import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { PetsListComponent } from './componentes/pets-list/pets-list.component';
import { UpdatePetsComponent } from './componentes/update-pets/update-pets.component';
import { PetsDetailsComponent } from './componentes/pets-details/pets-details.component';
import { CreatePetsComponent } from './componentes/create-pets/create-pets.component';

const routes: Routes = [
  {path: '', redirectTo: 'pet', pathMatch: 'full'},
  {path: 'pets', component: PetsListComponent},  
  {path: 'add', component: CreatePetsComponent},
  {path: 'update/:id', component: UpdatePetsComponent },
  {path: 'details/:id', component: PetsDetailsComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
