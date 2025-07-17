/*1. Take values of length and breadth of a rectangle from user and check if it is square or not.*/
import java.util.Scanner;
class Q1{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Length :");
        int Length = Sc.nextInt();
        System.out.println("Enter Bwidth :");
        int Breadth = Sc.nextInt();
        if(Length == Breadth ){
           System.out.println("It is Square");
           }
           else {
           System.out.println("It is Rectangle");
           }
           
        
    }
}
