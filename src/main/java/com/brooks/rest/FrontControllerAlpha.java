package com.brooks.rest;

import static com.brooks.util.ClientMessageUtil.ACCOUNT_SUCCESSFUL;
import static com.brooks.util.ClientMessageUtil.ACCOUNT_UNSUCCESSFUL;
import static com.brooks.util.ClientMessageUtil.UPDATE_SUCCESSFUL;
import static com.brooks.util.ClientMessageUtil.UPDATE_UNSUCCESSFUL;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brooks.ajax.ClientMessage;
import com.brooks.model.Account;
import com.brooks.model.Dog;
import com.brooks.service.AccountService;
import com.brooks.service.DogService;

@RestController("frontController")
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path="/account")
public class FrontControllerAlpha implements FrontController{

	private static Logger logger = Logger.getLogger(FrontControllerAlpha.class);
	
	@Autowired
	private DogService dogService;
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/all")
	public List<Account> getAllAccounts() {
		return accountService.getAllAccounts();
	}

	@GetMapping("/get")
	public ResponseEntity<Account> getAccountByUsername(@RequestBody Account account) {
		logger.trace("Looking for account by username " +account);
		Account foundAcc = accountService.getAccountByUsername(account.getUsername());
		if(foundAcc != null) {
			return new ResponseEntity<>(foundAcc, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/create")
	public ResponseEntity<ClientMessage> createAccount(@RequestBody Account account) {
		logger.trace("Creating account " +account);
		if(accountService.createAccount(account))
			return new ResponseEntity<>(ACCOUNT_SUCCESSFUL, HttpStatus.CREATED);
		else
			return new ResponseEntity<>(ACCOUNT_UNSUCCESSFUL, HttpStatus.BAD_REQUEST);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<ClientMessage> updateAccount(@RequestBody Account account) {
		logger.trace("UpdatingAccount "+account);
		Account a = accountService.getAccountByUsername(account.getUsername());
		if(a != null) {
			accountService.updateAccount(a);
			return new ResponseEntity<>(UPDATE_SUCCESSFUL, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(UPDATE_UNSUCCESSFUL, HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/delete")
	public ResponseEntity<ClientMessage> deleteAccount(@RequestBody Account account) {
		logger.trace("Deleting account "+account);
		Account a = accountService.getAccountByUsername(account.getUsername());
		if(a != null) {
			accountService.deleteAccount(a);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	@GetMapping("/getAllDogs")
	public List<Dog> getAllDogs() {
		return dogService.getAllDogs();
	}

	@GetMapping("/getDog")
	public Dog getDogByBreed(@RequestBody Dog dog) {
		return (dogService.getDogByBreed(dog.getBreed()));
	}

	@PostMapping("/createDog")
	public void createDog(@RequestBody Dog dog) {
		dogService.createDog(dog);
		
	}

	@PutMapping("/updateDog")
	public Dog updateDog(@RequestBody Dog dog) {
		return dogService.updateDog(dog);
	}

	@DeleteMapping("/deleteDog")
	public void deleteDog(@RequestBody Dog dog) {
		 dogService.deleteDog(dog);
	}

	

}
