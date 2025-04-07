import { Component, inject, OnInit } from '@angular/core';
import { MasterService } from '../../services/master.service';
import { ParentDept } from '../../models/parent-dept'
import { ApiResponse } from '../../models/api-response';
import { ChildDept } from '../../models/child-dept';
import { FormsModule } from '@angular/forms';
import { Employee } from '../../models/employee.model';

@Component({
  selector: 'app-employee',
  imports: [FormsModule],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent implements OnInit {
  masterService = inject(MasterService);
  parentDeptList: ParentDept[] = [];
  selectedDept: string = '';
  childParentList: ChildDept[] = [];
  
  newEmployee: Employee = new Employee();
  allEmployee: Employee[] = []

  ngOnInit(): void {
      this.getParentDeptList();
      this.getAllEmployees();
  }

  getParentDeptList() {
    this.masterService.getParentDept().subscribe((res: ApiResponse<ParentDept[]>)=> {
      this.parentDeptList = res.data;
    })
  }

  getChildParent() {
    this.masterService.getChildParent(this.selectedDept).subscribe((res: ApiResponse<ChildDept[]>) => {
      this.childParentList = res.data;
    })
  }
  
  createEmployee() {
    this.newEmployee.employeeId = 0;
    this.newEmployee.deptId == 0 ? this.newEmployee.deptId = parseInt(this.selectedDept) : false;
    this.masterService.createEmployee(this.newEmployee).subscribe(res => {
      this.allEmployee.push(res)
    });
  }

  getAllEmployees() {
    this.masterService.getAllEmployees().subscribe((res: Employee[]) => {
      this.allEmployee = res;
    });
  }

  deleteEmployee(id: number) {
    this.masterService.deleteEmployees(id).subscribe(res => {
      this.getAllEmployees();
    });
  }
}
