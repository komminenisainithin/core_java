package controlstructures;
import java.util.Scanner;

public class CRMDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer ID:");
        int customerId  = input.nextInt();
        System.out.println("Enter Customer Name:");
        String customerName = input.next();
        double totalPurchaseAmount =0.0;
        int interactionCount=0;
        char continueInput;
        do{
            System.out.println("Enter Purchase Amount for Interaction "+(interactionCount+1));
            double PurchaseAmount = input.nextDouble();
            totalPurchaseAmount += PurchaseAmount;
            interactionCount++;
            System.out.println("Do you want to enter another purchase amount? (y/n):");
            continueInput = input.next().charAt(0);

        }while(continueInput =='y'|| continueInput =='Y');
        double averagePurchase= totalPurchaseAmount/interactionCount;
        String status;
        if(totalPurchaseAmount >=50000){
            status="Premium";

        }else if(totalPurchaseAmount>=25000){
            status="Gold";

        }else if(totalPurchaseAmount>=10000){
            status="Silver";
        }else{
            status="Bronze";
        }

        String activeNotice = interactionCount >= 5 ? "Active Customer": "Inactive Customer";

        //Displaying the CRM details
        System.out.println("customer ID:"+ customerId);
        System.out.println("customer Name:"+ customerName);
        System.out.println("Total purchase amount:"+ totalPurchaseAmount);
        System.out.println("Average purchase amount:"+ averagePurchase);
        System.out.println("interaction count:"+ interactionCount);
        System.out.println("Customer Status:"+ status);
        System.out.println("Customer Activity Notice:"+ activeNotice);
        input.close();
    }

}
