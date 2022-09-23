import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeesComponent } from './employees/employees.component';
import { HomeComponent } from './home/home.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { EmployeeOperationComponent } from './employee-operation/employee-operation.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
const routes: Routes = [
  {path:"home", component:HomeComponent},
  {path:"employees", component:EmployeesComponent},
  {path:"add", component:AddEmployeeComponent},
  {path:"employee-operation", component:EmployeeOperationComponent},
  {path:"employee-operation", component:EmployeeOperationComponent},
  {path:"update", component:UpdateEmployeeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
