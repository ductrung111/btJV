package core;
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(123456789, "nguyen van A", -500.0);
        
        acc.deposit(500);
        acc.withdraw(300);
        acc.deposit(100);
        acc.withdraw(500);
        acc.setOwnerName("Nguyen Van B");
        
        
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Owner Name: " + acc.getOwnerName());
    }
}