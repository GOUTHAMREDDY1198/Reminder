import { Component } from '@angular/core';
import { ReminderService } from './services/reminder.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'Reminder-UI';
  data;

  constructor(private reminderService : ReminderService){}

  getAllReminders(){
   this.data = this.reminderService.getAllData()
  //  .then(data=>{
  //   this.data=data
  //  })
  }

}
