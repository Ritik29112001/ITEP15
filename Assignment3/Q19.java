/*WAP to check wheater number is positive or negative*/
import java.util.Scanner;
class Ponetive{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a NO.");
        double n =Sc.nextDouble();
        if(n>=0){
            System.out.println("Given No. is positive");
        }
        else{
            System.out.println("Given NO. is Negative");
        }

    }
}