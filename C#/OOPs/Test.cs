using System;
class BankAccount{
    private string accountNumber;
    private double balance;

    public BankAccount(string accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void Deposit(double amount){
        if(amount >0){
            balance = amount + balance;
            Console.WriteLine("Amount deposited: " +amount);
        }
        else{
            Console.WriteLine("Invalid input.");
        }
    }

    public void Withdraw(double amount){
        if(amount >0 && balance>=amount){
            balance = balance - amount;
            Console.WriteLine("Amount debited" + amount);
            Console.WriteLine(balance);
    }
    else{
        Console.WriteLine("Invalid input.");
    }
}
}

class main{
    static void Main(string[] args){
        BankAccount ba= new BankAccount("234322");
        ba.Deposit(500);
        ba.Withdraw(100);
        
    }
}