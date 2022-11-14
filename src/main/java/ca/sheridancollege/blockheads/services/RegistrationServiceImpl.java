package ca.sheridancollege.blockheads.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sheridancollege.blockheads.domain.RegistrationData;
import ca.sheridancollege.blockheads.repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Override
	public List<RegistrationData> findAll(){
		return registrationRepository.findAll();
	}

//	@Override
//	public RegistrationData findById(Long id) {
//		return registrationRepository.findByID(id);
//	}

	@Override
	public RegistrationData findbyCompanyName(String companyName) {
		return registrationRepository.findByCompanyName(companyName);
	}

	@Override
	public RegistrationData findBycompanyEmail(String companyEmail) {
		return registrationRepository.findByCompanyEmail(companyEmail);

	}

	@Override
	public RegistrationData save(RegistrationData registrationData) {
		return registrationRepository.save(registrationData);
	}

	@Override
	public void deleteRegistration(Long id) {
		 registrationRepository.deleteById(id);
	}

	@Override
	public RegistrationData findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
