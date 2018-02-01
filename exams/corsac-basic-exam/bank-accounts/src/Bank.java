import java.util.ArrayList;
import java.util.List;

public class Bank {
  private BankAccount bankAccount;
  private List<BankAccount> listOfAccounts;

  public Bank() {
    listOfAccounts = new ArrayList<>();
  }

  public void createAccount(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
    listOfAccounts.add(bankAccount);
  }

  public int getAllMoney() {
    int sumOfAllAccounts = 0;
    for (int i = 0; i < listOfAccounts.size(); i++) {
      sumOfAllAccounts += listOfAccounts.get(i).getCurrency().getValue();
    }
    return sumOfAllAccounts;
  }
}
