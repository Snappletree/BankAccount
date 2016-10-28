import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
public class mainClass
{
    public static void main(String [] agrs){
        accountClass newaccountClass = new accountClass();
        String name;
        double balance;
        double withdrawal;
        double deposit;
        double number;
        double deposit1;
        double withdrawa1;

        Scanner reader = new Scanner(System.in);
        //Asks user for his/her name
        System.out.println("Hello what is your name?");
        name = reader.nextLine();

        //Asks user for his/her balance
        System.out.println("Hello "+name+ " what is your current balance?");
        balance = reader.nextDouble();

        //Loop the code over until 3 is entered
        while (balance!= 0) {
            //asks the user for one of three actions
            System.out.println("Would you like to deposit or withdrawal from your current balance of $" + balance + "? Print 1 for deposit and 2 for withdrawal and press 3 to quit.");
            number = reader.nextDouble();
            
            if (number == 1){
                //Asks the user a ammount to deposit
                System.out.println("What ammount do you want to deposit " + name + "?");
                deposit1 = reader.nextDouble();

                balance = deposit1 + balance;
                System.out.println("Your new balance is $" + balance + ".");

            }
            else if (number == 2) {
                //Asks the user a ammount to withdraw
                System.out.println("What ammount to you want to withdraw " + name + "?");
                withdrawa1 = reader.nextDouble();

                balance = balance - withdrawa1;
                System.out.println("Your new balance is $" + balance + ".");

            }
            else if (number == 3) {
                //will quit the loop when 3 is entered
                System.out.println("Your current balance " + name + " is $" + balance + " good bye " + name);
                System.exit(0);
            }
        }
    }
}