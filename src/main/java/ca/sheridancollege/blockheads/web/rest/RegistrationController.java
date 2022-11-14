package ca.sheridancollege.blockheads.web.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.blockheads.domain.RegistrationData;
import ca.sheridancollege.blockheads.services.RegistrationService;

@RestController
@RequestMapping("/api/registrationData")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@GetMapping(value= {"","/"})
	public List<RegistrationData> getAllRegistrationData(){
		return registrationService.findAll();
	}
	
	@PostMapping(value= {"","/"})
	public RegistrationData save(@RequestBody RegistrationData registrationData) {
		return registrationService.save(registrationData);
	}

}
