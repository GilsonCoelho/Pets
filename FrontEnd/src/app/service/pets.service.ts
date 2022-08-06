import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PetsService {

  
  private baseUrl = 'http://localhost:8080/api/v1/pets';

  constructor(private http: HttpClient) { }

  getPet(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  // tslint:disable-next-line:ban-types
  createPet(pet: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, pet);
  }

  // tslint:disable-next-line:ban-types
  updatePet(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }
  updateStatus(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deletePet(id: number): Observable<Object> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getPetsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
  getPetsListAtivos(): Observable<any>{
    return this.http.get(`${this.baseUrl}/ativos`);
  }
  getPetsListInativos(): Observable<any>{
    return this.http.get(`${this.baseUrl}/pets/inativos`);
  }
}