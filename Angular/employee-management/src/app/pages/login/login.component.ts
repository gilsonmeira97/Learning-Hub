import { HttpClient } from '@angular/common/http';
import { Component, inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Employee } from '../../models/employee.model';
import { Router } from '@angular/router';
import { ApiResponse } from '../../models/api-response';

type Login = {userName: string, password: string};

@Component({
  selector: 'app-login',
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  loginURL: string = 'https://projectapi.gerasim.in/api/EmployeeManagement/login';
  loginObj: Login = { userName: '', password: '' };
  resultMessage: String = '';
  
  // http = inject(HttpClient); // New option

  constructor(private http: HttpClient, private router: Router){}

  onLogin(){
    this.resultMessage='';
    this.http.post<ApiResponse<Employee>>(this.loginURL, this.loginObj).subscribe(({message, data}: ApiResponse<Employee>) => {
      if(data) {
        localStorage.setItem('employeeApp', JSON.stringify(data));
        this.router.navigateByUrl('dashboard');
      } else {
        this.resultMessage = message;
      }
    })
  }
}
