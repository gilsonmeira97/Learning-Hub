import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../services/auth.service';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../../environments/environment.development';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-profile',
  imports: [CommonModule, RouterModule],
  templateUrl: './profile.component.html',
  styleUrl: './profile.component.css'
})
export class ProfileComponent implements OnInit {
  userData: any = null;
  errorMessage = '';

  constructor(private authService: AuthService, private http: HttpClient){}

  ngOnInit(): void {
    this.http.get(`${environment.apiUrl}/profile`).subscribe({
      next: (response: any) => {this.userData = response},
      error: (err: any) => {
        console.error('Failed to fetch profile.', err);
        this.errorMessage = err.error?.message || 'Could not load profile data.';
      }
    })
  }

  onLogout() {
    this.authService.logout();
  }

}
