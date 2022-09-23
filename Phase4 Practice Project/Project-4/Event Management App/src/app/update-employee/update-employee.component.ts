import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { Employees } from '../employees';
import { EmployeesService } from '../employees.service';
@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {
  msg:string = "";
  employeeRef = new FormGroup({
    first_name: new FormControl(),
    last_name: new FormControl(),
    email: new FormControl()
  })
  
  emp:Array<Employees>=[];
  constructor(public es: EmployeesService,
    public router:Router) { }

  ngOnInit(): void {
    
  }

  loadEmployeeDetails() {
    
    this.es.loadEmployeeData().subscribe({
      next:(data:any)=>this.emp=data,
      error:(error:any)=>console.log(error),
      complete:()=>this.msg="Employee Details updated successfully",
    })

  }
  
   updateEmployee(){
    let emp = this.employeeRef.value;
    this.es.storeEmployeeData(emp).subscribe({
      next:(data:any)=>console.log(data),
      error:(error:any)=>console.log(error),
      complete:()=>this.loadEmployeeDetails()
    })
    this.employeeRef.reset();
   } 
   goBack(){
      this.router.navigate(["employees"]);
   }
   

}
