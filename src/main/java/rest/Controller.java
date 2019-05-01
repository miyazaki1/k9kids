package rest;

import java.util.List;

import model.Account;
import model.Dog;

public interface Controller {

	List<Account> findAllAccounts();
	Account findAccount(Account account);
	
	List<Dog> findAllDogs();
	Dog findDog(Dog dog);
}
