package ca.sheridancollege.blockheads.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ca.sheridancollege.blockheads.domain.RegistrationData;

@Service
public interface RegistrationService {

	public List<RegistrationData> findAll();
	
	public RegistrationData findById(Long id);
	
	public RegistrationData findbyCompanyName(String companyName);
	
	public RegistrationData findBycompanyEmail(String companyEmail);
	
	public RegistrationData save(RegistrationData registrationData);
	
	public void deleteRegistration(Long id);
	
}
