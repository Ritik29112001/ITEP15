/*WAP to calculate area of circle*/
import java.util.Scanner;
class Q16{
    public static void main(String args[]){
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter the radius");
        double r =Sc.nextDouble();
        double d = 3.14*r*r;
        System.out.println("Arae of Circle is:\n"+d);
    }
}