# Create a Currency class.
# It should have a code, a central bank name and a value field.
# Create a constructor for setting those values.

# Create a UsaDollar class that inherits from the Currency.
# Create a constructor that accepts the value.
# The code should be "USD"
# and the central bank name should be "Federal Reserve System"

# Create a HungarianForint class that inherits from the Currency.
# Create a constructor that accepts the value.
# The code should be "HUF"
# and the central bank name should be "Hungarian National Bank

# Create a BankAccount class.
# It should have a name, a pin code and a Currency field.
# Create a constructor for setting those values.

# Create a deposit method which check if the given parameter is positive
# then adds the parameter to the Currency's value field.

# Create a withdraw method with two parameters: a pin code and an amount.
# It should check if the given pin is correct (equals with the original pin)
# and the Currency's value is more than the amount parameter.
# If so, subtract the amount from the Currency's value and return with the amount.
# Otherwise don't modify the Currency's value and return with 0.

# Create a Bank class which can store BankAccounts.
# It should have a create_account method with a BankAccount as an input parameter.
# It should have a get_all_money method, which returns the sum of
# the accounts' money (sum of Currency values regardless of the Currency type).

# For example:

jane_cash = UsaDollar(1500)

jane_acc = BankAccount("Jane", "1234", jane_cash)
jane_acc.deposit(500)

jane_withdraw = jane_acc.withdraw("1111", 500)
# janeWithdraw = 0

jane_withdraw = jane_acc.withdraw("1234", 500)
# janeWithdraw = 500

jane_withdraw = jane_acc.withdraw("1234", 2000)
# janeWithdraw = 0

johnny_cash = HungarianForint(500)

my_bank = Bank()
my_bank.create_account(jane_acc)
my_bank.create_account(BankAccount("Johnny", "1993", johnny_cash))

all_money = my_bank.get_all_money()
# all_money == 2000
