package com.brooks.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.brooks.model.Account;
import com.brooks.model.Dog;
import com.brooks.service.AccountService;
import com.brooks.service.DogService;

@Controller("frontController")
@CrossOrigin(origins = "http://localhost:4200")
public class FrontControllerAlpha implements FrontController{

	@Autowired
	private DogService dogService;
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/getAllAccounts")
	public @ResponseBody List<Account> getAllAccounts() {
		return accountService.getAllAccounts();
	}

	@GetMapping("/getAccount")
	public @ResponseBody Account getAccountByUsername(@RequestBody Account account) {
		return (accountService.getAccountByUsername(account.getUsername()));
	}

	@PostMapping("/createAccount")
	public void createAccount(@RequestBody Account account) {
		accountService.createAccount(account);
		
	}
	
	@PutMapping("/updateAccount")
	public @ResponseBody Account updateAccount(@RequestBody Account account) {
		return accountService.updateAccount(account);
	}

	@DeleteMapping("/deleteAccount")
	public @ResponseBody void deleteAccount(@RequestBody Account account) {
		accountService.deleteAccount(account);
	}
	
	
	@GetMapping("/getAllDogs")
	public @ResponseBody List<Dog> getAllDogs() {
		return dogService.getAllDogs();
	}

	@GetMapping("/getDog")
	public @ResponseBody Dog getDogByBreed(@RequestBody Dog dog) {
		return (dogService.getDogByBreed(dog.getBreed()));
	}

	@PostMapping("/createDog")
	public @ResponseBody void createDog(@RequestBody Dog dog) {
		dogService.createDog(dog);
		
	}

	@PutMapping("/updateDog")
	public @ResponseBody Dog updateDog(@RequestBody Dog dog) {
		return dogService.updateDog(dog);
	}

	@DeleteMapping("/deleteDog")
	public @ResponseBody void deleteDog(@RequestBody Dog dog) {
		 dogService.deleteDog(dog);
	}

	

}
