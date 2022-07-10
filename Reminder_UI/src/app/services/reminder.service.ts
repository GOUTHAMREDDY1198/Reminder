import { HttpClient } from '@angular/common/http'

const baseUrl = 'http://localhost:8081';
export class ReminderService{
    constructor(private http: HttpClient){}

    getAllData(){
      return this.http.get(`${baseUrl}/${'hello'}`)
    }
}
