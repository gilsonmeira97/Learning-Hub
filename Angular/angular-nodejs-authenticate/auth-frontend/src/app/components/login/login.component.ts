import { Component } from '@angular/core';
import { AuthService } from '../../services/auth.service';
import { Router, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

type User = {email: string, password: string};

@Component({
  selector: 'app-login',
  imports: [FormsModule, RouterModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})

export class LoginComponent {
  loginData: User = {email: '', password: ''};
  errorMessage: string = '';

  constructor(private authService: AuthService, private router: Router){}

  onLogin(){
    this.errorMessage = '';
    this.authService.signIn(this.loginData).subscribe({
      next: (response) => {
        const token = response.token;
        this.authService.setToken(token);
        this.router.navigate(['/profile']);
      },
      error: (err) => {
        this.errorMessage = err.error?.message || 'Login failed. Please try again.'
      }
    })
  }

}
