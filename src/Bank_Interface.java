public interface Bank_Interface {
    Double check_Balance();
    String add_Money(int amount);
    String withdraw_Money(int amount, String password);
    Double calculate_Interest(int years );
}
