package DesignPatterns.Creational.AbstractFactoryDP;

/*In this extended example:

Additional concrete classes (SbiBank, CreditCardTransaction, etc.) are created to represent different banks and transaction methods.
The ConcreteTransactionFactory class has been modified to randomly select a bank and a transaction method. You can implement your own logic for selecting banks and payment methods.
*/
// Step 1: BankFactory interface
interface BankFactory {
    String getBankName();
}

// Step 2: Concrete classes for different banks
class HdfcBank implements BankFactory {
    @Override
    public String getBankName() {
        return "HDFC Bank";
    }
}

class SbiBank implements BankFactory {
    @Override
    public String getBankName() {
        return "State Bank of India";
    }
}

// Step 3: TransactionMethodFactory interface
interface TransactionMethodFactory {
    double getAmount();
}

// Step 4: Concrete classes for different transaction methods
class DebitCardTransaction implements TransactionMethodFactory {
    @Override
    public double getAmount() {
        return 10.00;
    }
}

class CreditCardTransaction implements TransactionMethodFactory {
    @Override
    public double getAmount() {
        return 20.00;
    }
}

// Step 5: Abstract class AbstractTransactionFactory
abstract class AbstractTransactionFactory {
    // Members
    abstract BankFactory createBankFactory();
    abstract TransactionMethodFactory createTransactionMethodFactory();
}

// Step 6: Concrete class ConcreteTransactionFactory extending AbstractTransactionFactory
class ConcreteTransactionFactory extends AbstractTransactionFactory {
    @Override
    BankFactory createBankFactory() {
        // Example: Randomly select a bank (You can implement your logic here)
        return Math.random() < 0.5 ? new HdfcBank() : new SbiBank();
    }

    @Override
    TransactionMethodFactory createTransactionMethodFactory() {
        // Example: Randomly select a transaction method (You can implement your logic here)
        return Math.random() < 0.5 ? new DebitCardTransaction() : new CreditCardTransaction();
    }
}

// Step 7: Client Code
public class TransactionClient {
    public static void main(String[] args) {
        // Creating an instance of the concrete transaction factory
        AbstractTransactionFactory transactionFactory = new ConcreteTransactionFactory();

        // Using the concrete transaction factory to create instances of bank and transaction method factories
        BankFactory bankFactory = transactionFactory.createBankFactory();
        TransactionMethodFactory transactionMethodFactory = transactionFactory.createTransactionMethodFactory();

        // Using the created objects
        System.out.println("Bank Name: " + bankFactory.getBankName());
        System.out.println("Transaction Method Amount: $" + transactionMethodFactory.getAmount());
    }
}
