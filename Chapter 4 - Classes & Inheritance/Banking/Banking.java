package Banking;

public class Banking {
    public static void main(String[] args) {
        Account acct1 = new Account("Ted Murphy", "72354", 102.56);
        Account acct2 = new Account("Anita Gomez", "69713", 40.00);
        Account acct3 = new Account("Amir Reddy", "93757", 759.32);

        acct1.deposit(1000);
        acct1.withdraw(120, 0);
        System.out.println("Bal after withdrawal "+acct1.getBalance());
        double gomezBalance = acct2.deposit(500.00);
        System.out.println(" Balance after deposit: " + gomezBalance);

        System.out.println("Balance after withdrawal: " + acct2.withdraw(430.75, 1.50));
    }
}
