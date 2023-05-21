import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Event } from './entity/event';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  public title = 'Events App';
  public event: Event;

  constructor(private http: HttpClient) {
    this.http.get<Event>('http://localhost:8080/task').subscribe((result) => {
      this.event = result;
      console.log(this.event);
    });
  }
}
