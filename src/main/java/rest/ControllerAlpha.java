package rest;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import service.AccountService;
import service.DogService;

import model.Account;
import model.Dog;

@Controller("Controller")
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerAlpha implements Controller{

	@Autowired
	private DogService dogService;
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/findAllAccounts")
	public @ResponseBody List<Account> findAllAccounts() {
		return accountService.findAllAccounts();
	}

	@PostMapping("/findAccount")
	public @ResponseBody Account findAccount(@RequestBody Account account) {
		return (accountService.getAccount(account.getUsername()));
	}

	@GetMapping("/findAllDogs")
	public @ResponseBody List<Dog> findAllDogs() {
		return dogService.findAllDogs();
	}

	@PostMapping("/findDog")
	public @ResponseBody Dog findDog(@RequestBody Dog dog) {
		return (dogService.getDog(dog.getBreed()));
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String value() {
		// TODO Auto-generated method stub
		return null;
	}

}
