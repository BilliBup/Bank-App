import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name, Password, Balance to create an account");

        String name = sc.nextLine();
        String password = sc.nextLine();
        double balance = sc.nextDouble();
        Axis_User user = new Axis_User(name,password,balance);

        String message = user.add_Money(100000);
        System.out.println(message);

        System.out.println("Enter amount you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Please enter password");
        String pass = sc.nextLine();

        System.out.println(user.withdraw_Money(money,pass));

        System.out.println(user.calculate_Interest(10));

    }
}