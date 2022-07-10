import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const baseUrl = 'http://localhost:8081';
@Injectable()
export class ReminderService{
    constructor(private http: HttpClient){}

    // getAllData(){
    //   return this.http.get(`${baseUrl}/${'hello'}`)
    // }

    getAllData(): Promise<any> {
      return this.http.get(`${baseUrl}/${'hello'}`)
      .toPromise()
      .then(response => response as any)
      .catch(this.handleError);
      }

      private handleError(error: any): Promise<Array<any>> {
        console.error('An error occurred', error);
        return Promise.reject(error.message || error);
        }

}
