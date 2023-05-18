package emsi.org.ebankingbackend.repositories;

import emsi.org.ebankingbackend.entities.BankAccount;
import emsi.org.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
