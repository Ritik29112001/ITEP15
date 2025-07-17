/*8. WAP to check wheather number is even or odd*/
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int a =Sc.nextInt();
        if(a%2==0){
            System.out.println("Given no. is Even");
        }
        else{
            System.out.println("Given NO. is Odd");

        }
    }
}
