import { HttpClient } from "@angular/common/http";
import { EventEmitter, Injectable } from "@angular/core";
import { RegisterForm } from "./registerform.model";


@Injectable()
export class RegisterFormService {
	constructor(private http:HttpClient){}
	
	getRegistrations(){
		return this.http.get<RegisterForm[]>('/api/registrationData')
	}
	
	addRegistration(registration : RegisterForm){
		return this.http.post('/api/registrationData', registration)
	}
	
	onRegistrationAdded = new EventEmitter<RegisterFormService>();
}