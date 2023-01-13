import java.util.Objects;
import java.util.UUID;

public class Axis_User implements Bank_Interface {
    private String name;
    private String account_No;
    private String password;
    private double balance;
    private static double interest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount_No() {
        return account_No;
    }

    public void setAccount_No(String account_No) {
        this.account_No = account_No;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterest() {
        return interest;
    }

    public static void setInterest(double interest) {
        Axis_User.interest = interest;
    }

    public Axis_User(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.interest = 6.5;
        this.account_No = String.valueOf(UUID.randomUUID());

    }

    @Override
    public Double check_Balance() {
        return balance;
    }

    @Override
    public String add_Money(int amount) {
        balance = balance+amount;
        return "Amount successfully added "+balance;
    }

    @Override
    public String withdraw_Money(int amount, String entered_password) {
       if(Objects.equals(entered_password,password)){
           if(amount>balance){
               return "Sorry insufficient balance";
           }
           else{
               return amount+"withdrawn the remaining balance is "+(balance-amount);
           }
       }
       else{
           return "Invalid password";
       }
    }

    @Override
    public Double calculate_Interest(int years) {
        return (balance*6.5*years)/100;
    }
}
