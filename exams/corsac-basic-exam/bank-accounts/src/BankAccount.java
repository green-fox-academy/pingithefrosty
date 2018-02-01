import java.util.Objects;

public class BankAccount {
  private String name;
  private String pinCode;
  private Currency currency;

  public BankAccount(String name, String pinCode, Currency currency) {
    this.name = name;
    this.pinCode = pinCode;
    this.currency = currency;
  }

  public Currency getCurrency() {
    return currency;
  }

  public void deposit(int depositedAmount) {
    if (depositedAmount >= 0) {
      currency.setValue(currency.getValue() + depositedAmount);
    }
  }

  public int withdraw(String pinCode, int withdrawnAmount) {
    if ((Objects.equals(this.pinCode, pinCode)) && (currency.getValue() > withdrawnAmount)) {
      currency.setValue(currency.getValue() - withdrawnAmount);
      return withdrawnAmount;
    } else {
      return 0;
    }
  }
}
