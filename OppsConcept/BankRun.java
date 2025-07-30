package OppsConcept;

public class BankRun {
    public static void main(String[] args){
        BankOpertaions bankAccount = new BankOpertaions();
        bankAccount.AccountNumber = 1234567890;
        bankAccount.accountHolderName = "SAI NITHIN";
        bankAccount.balance = 50000.00;
        bankAccount.greetCustomer();
        bankAccount.balanceEnquiry();
        bankAccount.deposit(20000.00);
        bankAccount.withdrawAmount(30000.00);
        
    }
}
