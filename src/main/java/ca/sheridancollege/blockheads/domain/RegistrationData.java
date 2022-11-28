package ca.sheridancollege.blockheads.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RegistrationData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String companyName;
	private String founderName;
	private String industry;
	private String primaryService;
	private String secondaryService;
	private String address;
	private String companyEmail;
	private String companyPhoneNumber;
	private String contactName;
	private String contactTitle;
	private String contactEmail;
	private String contactPhoneNumber;
	private int numberOfUsers;
	private String revenue;
	private String tokenType;
	private String useOfService;
	private boolean devSupport;
	private String devSupportDesc;
	private boolean newToken;
	private String newTokenDesc;
	private boolean smartContract;
	private String smartContractDesc;
	private String survey;
	public String referral;
	
	
	public RegistrationData(String companyName, String founderName, String industry, String primaryService,
			String secondaryService, String address, String companyEmail, String companyPhoneNumber, String contactName,
			String contactTitle, String contactEmail, String contactPhoneNumber, int numberOfUsers, String revenue,
			String tokenType, String useOfService, boolean devSupport, String devSupportDesc, boolean newToken, String newTokenDesc,
			boolean smartContract, String smartContractDesc, String survey, String referral) {
		super();
		this.companyName = companyName;
		this.founderName = founderName;
		this.industry = industry;
		this.primaryService = primaryService;
		this.secondaryService = secondaryService;
		this.address = address;
		this.companyEmail = companyEmail;
		this.companyPhoneNumber = companyPhoneNumber;
		this.contactName = contactName;
		this.contactTitle = contactTitle;
		this.contactEmail = contactEmail;
		this.contactPhoneNumber = contactPhoneNumber;
		this.numberOfUsers = numberOfUsers;
		this.revenue = revenue;
		this.tokenType = tokenType;
		this.useOfService = useOfService;
		this.devSupport = devSupport;
		this.devSupportDesc = devSupportDesc;
		this.newToken = newToken;
		this.newTokenDesc = newTokenDesc;
		this.smartContract = smartContract;
		this.smartContractDesc = smartContractDesc;
		this.survey = survey;
		this.referral = referral;
	}
	
	
	
	
	
}
