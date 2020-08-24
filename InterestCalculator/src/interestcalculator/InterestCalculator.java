package interestcalculator;
import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("SELECT THE OPTIONS " + "\n1." + " Interest Calculator-SB" + " \n2." + " Interest Calculator-FD"
                + "\n3." + " InterestCalculator-RD" + "\n4 " + " Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                SBaccount sb = new SBaccount();
                System.out.println("Enter the Average SB amount ");
                double amount = sc.nextDouble();
                System.out.println("Interest gained is : Rs. " + sb.calculateInterest(amount));
                break;
            case 2:
                FDaccount fd = new FDaccount();
                System.out.println("Enter the FD Amount");
                double fAmount = sc.nextDouble();
                System.out.println("Interest gained is : Rs. " + fd.calculateInterest(fAmount));
                break;
            case 3:
                RDaccount rd = new RDaccount();
                System.out.println("Enter the RD amount");
                double Ramount = sc.nextDouble();
                System.out.println("Interest gained is : Rs. " + rd.calculateInterest(Ramount));
                break;
            case 4:
                System.out.println("Run the program again if you changed your mind");
            default:
                System.out.println("Wrong choice");
            sc.close();
        }
    }
}