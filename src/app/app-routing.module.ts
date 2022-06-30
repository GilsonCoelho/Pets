import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { PetsListComponent } from './componentes/list-pets/pets-list.component';
import { PetsDetailsComponent } from './componentes/details-pets/pets-details.component';
import { PetsListAtivosComponent } from './componentes/list-ativos-pets/pets-list-ativos.component';
import { PetsListInativosComponent } from './componentes/list-inativos-pets/pets-list-inativos.component';
import { UpdatePetsComponent } from './componentes/update-pets/update-pets.component';
import { UpdateStatusComponent } from './componentes/update-status-pets/upStatus-pets.component';
import { CreatePetsComponent } from './componentes/create-pets/create-pets.component';

const routes: Routes = [
  {path: '', redirectTo: 'pet', pathMatch: 'full'},
  {path: 'pets', component: PetsListComponent},
  {path: 'details/:id', component: PetsDetailsComponent},  
  {path: 'add', component: CreatePetsComponent},
  {path: 'update/:id', component: UpdatePetsComponent },
  {path: 'ativos', component: PetsListAtivosComponent},
  {path: 'inativos', component: PetsListInativosComponent},  
  {path: 'status/:id', component: UpdateStatusComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
