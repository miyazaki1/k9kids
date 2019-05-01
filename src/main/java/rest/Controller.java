package canine.project.rest;

import java.util.List;

import canine.project.model.Account;
import canine.project.model.Dog;

public interface Controller {

	List<Account> findAllAccounts();
	Account findAccount(Account account);
	
	List<Dog> findAllDogs();
	Dog findDog(Dog dog);
}
