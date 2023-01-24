package lesson5;

public class BankAccount {
    int id;
    String name;
    double balance;

    double popolnenieScheta(double p) {
        balance += p;
        return balance;
    }

    double snyatieSoScheta(double s) {
        balance -= s;
        return balance;
    }
}
    class AccountOperation {
        public static void main(String[] args) {
            BankAccount ba = new BankAccount();
            ba.id = 12;
            ba.name = "User1";
            ba.balance= 456.9;
            ba.snyatieSoScheta(45.8);
            ba.popolnenieScheta(55.6);
            System.out.println("User: "+ba.name+", Balance: "+ba.balance);
        }
    }

