package ca.sheridancollege.blockheads.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.blockheads.domain.RegistrationData;
import ca.sheridancollege.blockheads.services.RegistrationService;

@Component
public class RegistrationBootstrap implements CommandLineRunner {

	
	@Autowired
	RegistrationService registrationService;
	
	@Override
	public void run(String... args) throws Exception {

	RegistrationData r1 = new RegistrationData("Little Chef Cooking", "Gordan Ramsey", "Food", "Cooking", "Teaching", "Toronto, Canada", "LC@gmail.com", "905-111-2222", "Michael Smith", "General Manager", "msLC@gmail.com", "905-111-1212", 80, "$10,000 - $50,000", "reward", "To connect with other startups", true, "Need Dev help", true, "Little Chef Token", true, "Need smart contract", "saw through online ad");
	
	
	registrationService.save(r1);
	
	}
}
