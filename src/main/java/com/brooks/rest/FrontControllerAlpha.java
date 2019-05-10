package com.brooks.rest;

import static com.brooks.util.ClientMessageUtil.ACCOUNT_SUCCESSFUL;
import static com.brooks.util.ClientMessageUtil.ACCOUNT_UNSUCCESSFUL;
import static com.brooks.util.ClientMessageUtil.UPDATE_SUCCESSFUL;
import static com.brooks.util.ClientMessageUtil.UPDATE_UNSUCCESSFUL;
import static com.brooks.util.ClientMessageUtil.DOG_SUCCESSFUL;
import static com.brooks.util.ClientMessageUtil.DOG_UNSUCCESSFUL;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping(path = "/account", produces = { MediaType.APPLICATION_JSON_VALUE })
public class FrontControllerAlpha implements FrontController {

	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(FrontControllerAlpha.class);

	@Autowired
	private DogService dogService;
	@Autowired
	private AccountService accountService;

	@GetMapping("/all")
	public List<Account> getAllAccounts() {
		return accountService.getAllAccounts();
	}

	@GetMapping("/get/{username}")
	public ResponseEntity<Account> getAccountByUsername(@PathVariable("username") String username, @RequestBody Account account){
		Account findAcc = accountService.getAccountByUsername(username);
		if(findAcc != null) {
			return new ResponseEntity<>(findAcc, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	

	@PostMapping("/create")
	public ResponseEntity<ClientMessage> createAccount(@RequestBody Account account) {
		//logger.trace("Creating account " +account);
		if(accountService.createAccount(account))
			return new ResponseEntity<>(ACCOUNT_SUCCESSFUL, HttpStatus.CREATED);
		else
			return new ResponseEntity<>(ACCOUNT_UNSUCCESSFUL, HttpStatus.BAD_REQUEST);
		
	}
	
	@PutMapping("/update/{username}")
	public ResponseEntity<ClientMessage> updateAccount(@PathVariable("username") String username, @RequestBody Account account) {
		//logger.trace("UpdatingAccount "+account);
		Account a = accountService.getAccountByUsername(username);
		if(a != null) {
			accountService.updateAccount(username, a);
			return new ResponseEntity<>(UPDATE_SUCCESSFUL, HttpStatus.OK);
		} else {
			
			return new ResponseEntity<>(UPDATE_UNSUCCESSFUL, HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/delete/{username}")
	public ResponseEntity<ClientMessage> deleteAccount(@PathVariable("username") String username) {
		//logger.trace("Deleting account "+account);
		Account a = accountService.getAccountByUsername(username);
		if(a != null) {
			accountService.deleteAccount(username);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	// Check The account login information and sending through to the front end.
	@PostMapping("/login")
	public ResponseEntity<Account> loginUser(@RequestBody Account account, HttpServletRequest request) {
		// logger.trace("Looking for account by username " + account.getUsername());
		Account foundAcc = accountService.validateAccountLogin(account.getUsername(), account.getPassword());
	
		if (foundAcc != null) {
			foundAcc.setPassword("");
			return new ResponseEntity<>(foundAcc, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/allDogs")
	public List<Dog> getAllDogs() {
		return dogService.getAllDogs();
	}

	@GetMapping("/getDog/{username}")
	public ResponseEntity<Dog> getDogByUsername(@PathVariable("username") String username, @RequestBody Dog dog) {
		Dog findDog = dogService.getDogByUsername(username);
		if(findDog != null) {
			return new ResponseEntity<>(findDog, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/createDog")
	public ResponseEntity<ClientMessage> createDog(@RequestBody Dog dog) {
		//logger.trace("Creating dog " + dog);
		if(dogService.createDog(dog))
			return new ResponseEntity<>(DOG_SUCCESSFUL, HttpStatus.CREATED);
		else
			return new ResponseEntity<>(DOG_UNSUCCESSFUL, HttpStatus.BAD_REQUEST);

	}

	@PutMapping("/updateDog/{username}")
	public ResponseEntity<ClientMessage> updateDog(@PathVariable("username") String username, @RequestBody Dog dog) {
		//logger.trace("UpdatingDog "+ Dog);
		Dog d = dogService.getDogByUsername(username);
		if(d != null) {
			dogService.updateDog(username, d);
			return new ResponseEntity<>(UPDATE_SUCCESSFUL, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(UPDATE_SUCCESSFUL, HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/deleteDog/{username}")
	public ResponseEntity<ClientMessage> deleteDog(@PathVariable("username") String username) {
	//logger.trace("Deleting dog "+ dog);
		Dog d = dogService.getDogByUsername(username);
		if(d != null) {
			dogService.deleteDog(username);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
