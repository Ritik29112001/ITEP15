/*2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/

import java.util.Scanner;
class Q2{
    public static void main (String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Quantity :");
        double Q = Sc.nextDouble();
        double Amount = Q*100;
        
        if (Amount>1000){
            double Dic = (10.0/100.0)*Amount;
            double net = Amount - Dic;
            System.out.println("we have got 10% Discount in your bill:\n"+ net);
        }
        else{
            System.out.println("your total Bill is:\n"+Amount);
        }
    }
}
