package javaoperators;

public class BankAccount {
        public static void main(String[] args) {
        Long AccountNumber = 1234567890l;
        String accountHolderName = "SAI NITHIN";
        String accountType = "Savings";
        double accountBlance = 50000.00;
        String bankName = "Satate Bank of India";
        String branchName = "Amravathi";
        double depositAmount = 20000.00;
        double withdrawAmount = 1000.00;
        boolean isActive= true;
        double minBlance = 1000.00;
        int noOfTransactions =0;
        double currentBlance = accountBlance + depositAmount - withdrawAmount;
        boolean minBlanceMaintained = currentBlance >= minBlance;
        String accountstatus = isActive ? "avtive": "inactive";
        boolean depositAmountAndActive= depositAmount>0 && isActive;
        noOfTransactions++;
        System.out.println("Account Number:"+ AccountNumber);
        System.out.println("Account Holder name:"+ accountHolderName);
        System.out.println("Bank Nmae:"+ bankName);
        System.out.println("Branch Name :"+ branchName);
        System.out.println("Account Type:"+ accountType);
        System.out.println("Account status:"+ accountstatus);
        System.out.println("number of transactions:"+ noOfTransactions);
        System.out.println("minimum balance maintained?:"+ minBlanceMaintained);
        System.out.println("deposit amount and active account?:"+ depositAmountAndActive);




}
}
