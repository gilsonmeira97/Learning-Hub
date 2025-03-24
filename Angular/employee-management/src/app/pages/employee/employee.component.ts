import { Component, inject, OnInit } from '@angular/core';
import { MasterService } from '../../services/master.service';
import { ParentDept } from '../../models/parent-dept'
import { ApiResponse } from '../../models/api-response';
import { ChildDept } from '../../models/child-dept';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-employee',
  imports: [FormsModule],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent implements OnInit {
  masterService = inject(MasterService);
  parentDeptList: ParentDept[] = [];
  selectedDept: String = '';
  childParentList: ChildDept[] = [];

  ngOnInit(): void {
      this.getParentDeptList();
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
}
