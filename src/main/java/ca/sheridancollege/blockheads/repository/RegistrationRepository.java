package ca.sheridancollege.blockheads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.blockheads.domain.RegistrationData;

@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationData, Long>{
	
	//public RegistrationData findByID(Long id);
	
	public RegistrationData findByCompanyName(String companyName);
	
	public RegistrationData findByCompanyEmail(String companyEmail);
}
