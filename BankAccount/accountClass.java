
public class accountClass
{

    private String name;
    private double balance;

    private double deposit;
    private double withdrawal;

    public accountClass () {
        name = null;
        balance = 0.0;
        deposit = 0.0;
        withdrawal = 0.0;
    }
    //Saves the users name
    public String getname() {
        return name;   
    }

    public void setname(String newname){
        name = newname;
    }
    //Saves the users balance
    public double getbalance() {
        return balance;  
    }

    public void setbalance(double newbalance){
        balance = newbalance;
    }
    //User is able to deposit
    public double getdeposit() {
        return deposit;  
    }

    public void setdeposit(double newdeposit){
        deposit = newdeposit;
    }
    //User is able to withdrawal
    public double getwithdrawal() {
        return withdrawal;  
    }

    public void setwithdrawal(double newwithdrawal){
        withdrawal = newwithdrawal;
    }

}
