/*10.Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400. */
import java.util.Scanner;
class LeapYear{
    public static void main (String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the  year:");
        int year = Sc.nextInt();

        if ((year%4==0 && year % 100 != 0)||(year%400 ==0)){
            
            System.out.println("It is a LeapYear\n");
        }
        else{
            System.out.println("It is not a Leap Year\n");
        }
    }
}