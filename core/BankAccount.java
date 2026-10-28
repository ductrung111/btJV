package core;

public class BankAccount {
    public int accountNumber;
    public String ownerName;
    private double balance;

    public BankAccount(int accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (initialBalance < 0) {
            this.balance = 0;
            System.out.println("Lỗi: Số dư ban đầu không được âm!");
        } else {
            this.balance = initialBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp thành công " + amount + " vào tài khoản. Số dư mới: " + balance);
        } else {
            System.out.println("Lỗi: Số tiền nạp phải lớn hơn 0!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Lỗi: Số tiền rút phải lớn hơn 0!");
        } else if (amount > balance) {
            System.out.println("Lỗi: Số dư không đủ để thực hiện giao dịch!");
        } else {
            balance -= amount;
            System.out.println("Rút thành công " + amount + ". Số dư còn lại: " + balance);
        }
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    
    public double getBalance() {
        return balance;
    }
}
