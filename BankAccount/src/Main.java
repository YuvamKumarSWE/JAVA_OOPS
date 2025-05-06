import com.yuvam.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        BankAccount bankAccount1 = new BankAccount(25000000 , "Yuvam Kumar", "Savings", 5.2);
        BankAccount bankAccount2 = new BankAccount(bankAccount1);
        System.out.println(bankAccount2);
    }
}