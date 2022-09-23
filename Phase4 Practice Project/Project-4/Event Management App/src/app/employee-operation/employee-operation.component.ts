import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employees } from '../employees';
import { EmployeesService } from '../employees.service';
// import { EmployeesService } from '../employees.service';
@Component({
  selector: 'app-employee-operation',
  templateUrl: './employee-operation.component.html',
  styleUrls: ['./employee-operation.component.css']
})
export class EmployeeOperationComponent implements OnInit {
  employees:any;
  msg:string="";
  constructor(public es:EmployeesService , public router:Router) { }

  ngOnInit(): void {
    let obj = sessionStorage.getItem("productInfo");
    if(obj != null){
        this.employees= JSON.parse(obj);
    }
  }

  deleteEmployee(id:any){
    this.es.delete(id).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>this.msg="Details Deleted Suceesfully , Go back ",
  
    })
}

  goBack(){
    this.router.navigate(["employees"]);
  }

  updateEmployee(){
    this.router.navigate(["update"]);

  }
  

}
