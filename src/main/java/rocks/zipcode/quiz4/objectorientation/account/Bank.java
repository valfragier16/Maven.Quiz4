package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    ArrayList<BankAccount> accounts = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount result = accounts.get(indexNumber);
        accounts.remove(result);
        return result;
    }

    public void addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        // throw new UnsupportedOperationException("Method not yet implemented");
        return accounts.contains(bankAccount);
    }

}
