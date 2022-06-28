import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PetsService {

  
  private baseUrl = 'http://localhost:8080/pets';

  constructor(private http: HttpClient) { }

  getPets(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  // tslint:disable-next-line:ban-types
  createPets(pets: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}/create`, pets);
  }

  // tslint:disable-next-line:ban-types
  updatePets(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  updatePetsStatus(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/status/${id}`, value);
  }

  deletePets(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/delete/${id}`, value);
  }

  getPetsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}/list/idade`);
  }
  getPetsListAtivos(): Observable<any>{
    return this.http.get(`${this.baseUrl}/ativos`);
  }
  getPetsListInativos(): Observable<any>{
    return this.http.get(`${this.baseUrl}/inativos`);
  }
}