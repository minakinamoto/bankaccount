package th.go.rd.bankaccount.data;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.go.rd.bankaccount.model.BankAccount;

import java.util.List;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount,Integer> {

    // ทำการ query select ให้เลย
    // @Query("select * fro user u where u.email address") << customQuery ใช้ประมาณนี้ได้
    List<BankAccount> findByCustomerId(int customerId);

}
