import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ApiResponse } from '../models/api-response';
import { ParentDept } from '../models/parent-dept';
import { ChildDept } from '../models/child-dept';

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
}
