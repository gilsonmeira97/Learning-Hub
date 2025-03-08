import { Component } from '@angular/core';
import { AuthService } from '../../services/auth.service';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

type User = {email: string, password: string};

@Component({
  selector: 'app-signup',
  imports: [FormsModule, RouterModule],
  templateUrl: './signup.component.html',
  styleUrl: './signup.component.css'
})
export class SignupComponent {
  signupData: User = {email: '', password: ''};
  successMessage = '';
  errorMessage = '';

  constructor(private authService: AuthService){}

  onSignup() {
    this.successMessage = '';
    this.errorMessage = '';
    this.authService.signUp(this.signupData).subscribe({
      next: (response) => {
        this.successMessage = response.message  || 'Registration successful! Please login.';

        this.signupData = {email: '', password: ''};
      },
      error: (err) => {
        this.errorMessage = err.error?.message || 'Signup failed. Please try again.'
      }
    });
  }
}
