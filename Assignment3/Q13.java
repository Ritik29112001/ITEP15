/*3. WAP to calculate the percentage of students*/
import java.util.Scanner;
class Percent{
    public static void main(String args[]){
        Scanner Sc =new Scanner(System.in );
        System.out.println("Enter Total No.");
        double t=Sc.nextDouble();
        double p= (t/1000)*100;
        System.out.println("The percentage is "+p );
    }
}