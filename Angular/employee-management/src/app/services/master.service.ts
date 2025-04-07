import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ApiResponse } from '../models/api-response';
import { ParentDept } from '../models/parent-dept';
import { ChildDept } from '../models/child-dept';
import { Employee } from '../models/employee.model';

@Injectable({
  providedIn: 'root'
})
export class MasterService {
  baseURL = "https://projectapi.gerasim.in/api/EmployeeManagement";

  constructor(private http: HttpClient) {}
  
  getParentDept(){
    return this.http.get<ApiResponse<ParentDept[]>>(`${this.baseURL}/GetParentDepartment`);
  }

  getChildParent(deptId: String){
    return this.http.get<ApiResponse<ChildDept[]>>(`${this.baseURL}/GetChildDepartmentByParentId?deptId=${deptId}`);
  }

  createEmployee(newEmployee: Employee) {
    return this.http.post<Employee>(`${this.baseURL}/CreateEmployee`, newEmployee);
  }

  getAllEmployees() {
    return this.http.get<Employee[]>(`${this.baseURL}/GetAllEmployees`);
  }

  deleteEmployees(employeeId: number) {
    return this.http.delete(`${this.baseURL}/DeleteEmployee/${employeeId}`);
  }
}
