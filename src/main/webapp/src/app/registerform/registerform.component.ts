import { Component, OnInit } from '@angular/core';
import { RegisterForm } from './registerform.model';
import { RegisterFormService } from './registerform.service';
import Swal from 'sweetalert2';

@Component({
	selector: 'app-registerform',
	templateUrl: './registerform.component.html',
	styleUrls: ['./registerform.component.css']
})
export class RegisterformComponent implements OnInit {

	companyName: string = '';
	founderName: string = '';
	industry: string = '';
	primaryService: string = '';
	secondaryService: string = '';
	address = ''
	companyEmail = '';
	companyPhoneNumber = '';
	contactName = '';
	contactTitle = '';
	contactEmail = '';
	contactPhoneNumber = '';
	numberOfUsers = 0;
	revenue = '';
	tokenType = '';
	useOfService = '';
	devSupport = true;
	devSupportDesc = '';
	newToken = true;
	newTokenDesc = '';
	smartContract = true;
	smartContractDesc = '';
	survey = '';

	constructor(private registerformService: RegisterFormService) { }

	registrations: RegisterForm[] = [];

	//  ngOnInit(): void {
	//  }


	ngOnInit() {
		this.registerformService.getRegistrations()
			.subscribe(
				(registrations: any[]) => {
					this.registrations = registrations
				},
				(error) => console.log(error)
			);
		this.registerformService.onRegistrationAdded.subscribe(
			(registration: RegisterForm) => this.registrations.push(registration)
		);
	}

	onCompanyAdd(event: any) {
		
		Swal.fire("Registration Successful!", "You will hear from us within a week", 'success')
		
		let registration: RegisterForm = new RegisterForm(this.companyName, this.founderName, this.industry, this.primaryService, this.secondaryService,
			this.address, this.companyEmail, this.companyPhoneNumber, this.contactName, this.contactTitle, this.contactEmail, this.contactPhoneNumber,
			this.numberOfUsers, this.revenue,
			this.tokenType, this.useOfService, this.devSupport, this.devSupportDesc, this.newToken, this.newTokenDesc, this.smartContract, this.smartContractDesc, this.survey);


		this.registerformService.addRegistration(registration).subscribe(
			(newRegistration: any) => {
				this.companyName = '';
				this.founderName = '';
				this.industry = '';
				this.primaryService = '';
				this.secondaryService = '';
				this.address = '';
				this.companyEmail = '';
				this.companyPhoneNumber = '';
				this.contactName = '';
				this.contactTitle = '';
				this.contactEmail = '';
				this.contactPhoneNumber = '';
				this.numberOfUsers = 0;
				this.revenue = '';
				this.tokenType = '';
				this.useOfService = '';
				this.devSupport = true;
				this.devSupportDesc = '';
				this.newToken = true;
				this.newTokenDesc = '';
				this.smartContract = true;
				this.smartContractDesc = '';
				this.survey = '';
				this.registerformService.onRegistrationAdded.emit(newRegistration); //emit new registration
			}
		)
	}
	
	
	displayDevSupport(x: number){
		console.log(x);
		const block1 = document.getElementById("serviceDisplay");
		if(x == 1) {
			block1!.style.display = "block";
			//style.display = "block";
		}
		else {
			block1!.style.display = "none";
		} 
		return;
	}
	
	displayNewToken(x: number){
		console.log(x);
		const block2 = document.getElementById("newTokenDisplay");
		if(x == 1) {
			block2!.style.display = "block";
		}
		else {
			block2!.style.display = "none";
		} 
		return;
	}
	
	displaySmartContract(x: number){
		const block3 = document.getElementById("smartContractDisplay");
		if(x == 1) {
			block3!.style.display = "block";
		}
		else {
			block3!.style.display = "none";
		} 
		return;
	}
	
	selectSurvey(){
		alert("Works");
	}
	

}
