import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employees } from './employees';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class EmployeesService {

  constructor(public http:HttpClient) { }
  loadEmployeeData():Observable<Employees[]>{
    return this.http.get<Employees[]>("http://localhost:3000/employees");
  }
  storeEmployeeData(employees:any):Observable<Employees>{
    return this.http.post<Employees>("http://localhost:3000/employees",employees);
  }
  findEmployeeById(id:any):Observable<Employees>{
    return this.http.get<Employees>("http://localhost:3000/employees/"+id);
  }

  delete(id:any):Observable<any>{
    return this.http.delete<any>("http://localhost:3000/employees/"+id);
  }
  updateEmployeeData(employees:any):Observable<Employees>{
    return this.http.put<Employees>("http://localhost:3000/employees",employees);
  }
}
