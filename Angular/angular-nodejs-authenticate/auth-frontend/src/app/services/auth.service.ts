import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from '../../environments/environment.development';

type User = {email: string; password: string};

@Injectable({
  providedIn: 'root'
})

export class AuthService {

  constructor(private http: HttpClient, private router: Router) { }

  signUp(user: User) {
    const body = user;
    return this.http.post<{message: string}>(`${environment.apiUrl}/signup`, body);
  }

  signIn(user: User) {
    const body = user;
    return this.http.post<{token: string}>(`${environment.apiUrl}/signin`, body);
  }

  logout() {
    localStorage.removeItem('token');
    this.router.navigate(['/signin']);
  }

  isLoggedIn() {
    return !!localStorage.getItem('token');
  }

  getToken() {
    return localStorage.getItem('token');
  }

  setToken(token: string) {
    localStorage.setItem('token', token);
  }

}
