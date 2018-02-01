
# Tasks
## 1-3. Complete the following tasks:
- [Mutual elements](mutual-elements/MutualElements.java)
- [Delete the comments](delete-the-comments/DeleteTheComments.java)
- [Bank Account](bank-accounts/BankAccount.java)

### Acceptance criteria
The application is accepted if:
- The solution works according to specification [1p each]
- The solution follows [styleguide](https://github.com/greenfox-academy/teaching-materials/blob/master/styleguide/java.md) [1p]
- Has proper error handling where the specification says it [1p each]
- Has the correct loops, methods, filters [1p each]
- The code is clean, without unnecessary repetition, and with descriptive names [1p each]
- You commit frequently with descriptive commit messages [1p]

## 4. Question time! [4p]

### What is the difference between static (class) method and instance method? [2p]

#### Your answer:
[When you make a class in Java, you have to instantiate it. Then the instantiated object have certain attributes which affects their behaviour, and when a method is executed it will refer to these variables.

If however you make the method static, then the objects will not depend on these attributes. You can simply run the method without creating an instance of that class.]

### Write an example use case for both! [2p]

#### Static method:
[Object.staticMethod();

This will refer to the class's static code. It is useful for generic calculations like math and random.]

#### Instance method:
[Object object = new Object();

object.nonstaticMethod();

This will refer to the initiated instance of the class. It is used in nearly all cases. In today's bank account exercise the the method withdraw is a method of the BankAccount class and uses its pinCode field for example.]
