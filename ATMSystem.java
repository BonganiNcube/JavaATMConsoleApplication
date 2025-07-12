import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        //simple Login
        String correctAccount = "12345678";
        String correcetPin = "0000";
        int attempts = 0;

         while (attempts < 3) {
            System.out.println("Enter Account Number");
            String accountInput = scanner.next();

            System.out.println("Enter Pin: ");
            String pinInput = scanner.next();
            
            if ( accountInput.equals(correctAccount) && pinInput.equals(correcetPin)) {
            System.out.println("Login successful \n");
            break;
         } else {
            System.out.println("Invalid credential. Try again \n");
            attempts++;
         }
         if (attempts == 3) {
            System.out.println("Too many attempts. Exiting");
            return;
         }
         }
        ATM myATM = new ATM(1000);

        while (true) {
            System.out.println("\n------------ATM MENU------------");
            System.out.println("1. Deposite");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Choose an Option");
        
        try {
            int choice = scanner.nextInt();
        switch (choice) {

            case 1:
            System.out.println("Enter amount to deposit:  ");
            double deposit = scanner.nextDouble();
            myATM.deposit(deposit);
                break;

            case 2:
            System.out.println("Enter amount to withdraw:  ");
            double withdraw = scanner.nextDouble();
            myATM.withdraw(withdraw);
                break;

            case 3:
            myATM.checkBalance();
                break;

            case 4:
            System.out.println("Thank you for using the services");
            return;
            default:
                System.out.println("Invalid choice. Please try again");
                break;
         }     
        } catch (InputMismatchException e) {
            System.out.println("Invalid choice. Please try again");
            scanner.nextLine();
        }
        }
    }
    }

  
    

