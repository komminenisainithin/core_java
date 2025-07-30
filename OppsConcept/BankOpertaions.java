package OppsConcept;

public class BankOpertaions {
    int AccountNumber;
    String accountHolderName;
    double balance;
    public void greetCustomer(){
        System.out.println("Welcome to the Bank,"+ accountHolderName+ "!");

    }
    public void balanceEnquiry(){
        System.out.println("Your current Balance is :"+ balance);
    }
    public void deposit(double amount){
        
        balance += amount;
        System.out.println("Deposited Amount:"+ amount);
        balanceEnquiry();
        
    }
    public void withdrawAmount(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn Amount:"+ amount);
            balanceEnquiry();
        }else{
            System.out.println("Insufficient balance for withdrawal of"+ amount);
        }
    }
    

}
