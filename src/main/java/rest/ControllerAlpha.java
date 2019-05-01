package canine.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.project.service.AccountService;
import com.project.service.DogService;

import canine.project.model.Account;
import canine.project.model.Dog;

@Controller("Controller")
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerAlpha implements Controller{

	@Autowired
	private DogService dogService;
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/findAllAccounts")
	public @ResponseBody List<Account> findAllAccounts() {
		return accountService.getAllAccounts();
	}

	@PostMapping("/findAccount")
	public @ResponseBody Account findAccount(@RequestBody Account account) {
		return (accountService.getAccount(account.getUsername()));
	}

	@GetMapping("/findAllDogs")
	public @ResponseBody List<Dog> findAllDogs() {
		return dogService.getAllDogs();
	}

	@PostMapping("/findDog")
	public @ResponseBody Dog findDog(@RequestBody Dog dog) {
		return (dogService.getDog(dog.getBreed()));
	}

}
