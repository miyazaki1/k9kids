package canine.project.repository;

import java.util.List;

import canine.project.model.Account;

public interface AccountRepository {
	List<Account> getAllAccounts();
	Account getAccountByUsername (String username);
}
