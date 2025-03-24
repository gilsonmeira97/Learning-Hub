import { HttpClient } from '@angular/common/http';
import { Component, inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { User } from '../../models/user.model';
import { Observable } from 'rxjs';
import { Route, Router } from '@angular/router';

type Login = {userName: string, password: string};
type ResponseLogin = { message: string, result: boolean, data: User };

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
    this.http.post<ResponseLogin>(this.loginURL, this.loginObj).subscribe(({message, data}: ResponseLogin) => {
      if(data) {
        localStorage.setItem('employeeApp', JSON.stringify(data));
        this.router.navigateByUrl('dashboard');
      } else {
        this.resultMessage = message;
      }
    })
  }
}
