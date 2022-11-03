import { Component } from '@angular/core';
import { StorageService } from './_services/storage.service';
import { AuthService } from './_services/auth.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  private roles: string[] = [];
  isLoggedIn = false;
  showAdminBoard = false;
  showModeratorBoard = false;
  username?: string;

  constructor(private storageService: StorageService, private authService: AuthService) { }

  ngOnInit(): void {
    this.isLoggedIn = this.storageService.isLoggedIn();
  console.log(1+":"+this.isLoggedIn);
    if (this.isLoggedIn) {
      const user = this.storageService.getUser();
      this.roles = user.roles;

      this.showAdminBoard = this.roles.includes('ADMIN');
      console.log(this.showAdminBoard);
      this.showModeratorBoard = this.roles.includes('MODERATOR');
      console.log(this.showModeratorBoard);
      this.username = user.username;
    }
  }

  logout(): void {
    console.log(2);
    this.authService.logout().subscribe({
      next: res => {
      
        this.storageService.clean();
        },
      error: err => {
        console.log(err);
      }
    });
    
    window.location.reload();
  }
}