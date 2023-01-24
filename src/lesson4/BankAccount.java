package lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;
    
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.name="User1";
        MyAccount.balance =14.35;

        System.out.println(MyAccount.id);
        System.out.println(MyAccount.name);
        System.out.println(HisAccount.name);
    }
}
