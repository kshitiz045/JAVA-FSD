import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { Employees } from '../employees';
import { EmployeesService } from '../employees.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {
  msg:string = "";
  employeeRef = new FormGroup({
    id: new FormControl(),
    first_name: new FormControl(),
    last_name: new FormControl(),
    email: new FormControl()
  })

  emp:Array<Employees>=[];
  constructor(
    public es: EmployeesService,
    public reouter:Router
  ) { }

  ngOnInit(): void {
  }
  loadEmployeeDetails() {
    //this.ps.loadProductData();
    this.es.loadEmployeeData().subscribe({
      next:(data:any)=>this.emp=data,
      error:(error:any)=>console.log(error),
      complete:()=>this.msg="Employee Details store successfully",
    })

  }
  
   storeEmployee(){
    let emp = this.employeeRef.value;
    this.es.storeEmployeeData(emp).subscribe({
      next:(data:any)=>console.log(data),
      error:(error:any)=>console.log(error),
      complete:()=>this.loadEmployeeDetails()
    })
    this.employeeRef.reset();
   } 

   goBack(){
    this.reouter.navigate(["employees"]);
   }
}
