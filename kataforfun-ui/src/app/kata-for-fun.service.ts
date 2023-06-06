import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Result } from './model/result';

@Injectable({
  providedIn: 'root'
})
export class KataForFunService {
  baseApi=environment.baseApi
  constructor(private http:HttpClient) { }


  getConverterNumber(inputNumber):Observable<Result> {
    return this.http.get<Result>(`${this.baseApi}/kata-for-fun/${inputNumber}`)
  }
}
