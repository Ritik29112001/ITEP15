/*7. WAP to find greater among three number*/
import java.util.Scanner;
class Greater{
    public static void main(String args[]){
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter 1 No.");
        int A = Sc.nextInt();
        System.out.println("Enter 2 No.");
        int B = Sc.nextInt();
        System.out.println("Enter 3 No.");
        int C = Sc.nextInt();
        if((A>B)&&(A>C)){
            System.out.println("Greater no."+A);
        }
         else if ((B>A)&&(B>C)){
            System.out.println("Greater No."+B);
        }
        else{
            System.out.println("Greater NO. "+C);
        }


    }
}