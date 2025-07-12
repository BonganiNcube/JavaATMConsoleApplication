public class ATM extends Bank {
    public ATM(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
            System.out.println("Deposite: R" + amount);
        } else{
            System.out.println("Amount must be greater than 0");
        }
    }
    @Override
    public void withdraw( double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than o");
        } else if  (amount > balance) {
            System.out.println("Insufficient funds.");
         } else {
                balance -= amount;
                System.out.println("Withdrawn: R" + amount);
            }

        }
        @Override
        public void checkBalance() {
            System.out.println("Current Balance: R" + balance);
        }


        
    }

