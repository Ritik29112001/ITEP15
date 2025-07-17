/*2. WAP to calculate area of rectangle*/
import java.util.Scanner;
class Ritik{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out .println("Enter a length ");
        double l=Sc.nextDouble();
        System.out.println("Enter breath");
        double b =Sc.nextDouble();
        double a=l*b;
        System.out.println("The Area of Rectangle:\n"+a);

    }
}