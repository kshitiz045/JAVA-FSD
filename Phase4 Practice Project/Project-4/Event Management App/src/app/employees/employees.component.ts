import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employees } from '../employees';
import { EmployeesService } from '../employees.service';

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {
  employee:Array<Employees> = [];
  constructor( public router:Router , public es:EmployeesService) { }

  ngOnInit(): void {
    this.loadEmployeeDetails();    
  }
  loadEmployeeDetails() {
    //this.ps.loadProductData();
    this.es.loadEmployeeData().subscribe({
      next:(data:any)=>this.employee=data,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("Completed")
    })

  }

  addEmployees(){
    this.router.navigate(["add"]);
  }

  viewEmployee(employees:any){
    sessionStorage.setItem("productInfo",JSON.stringify(employees));
    this.router.navigate(["employee-operation"]);
  }

 
 


}
