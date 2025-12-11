/*14. WAP to find lowest number among four different number */
import java.util.Scanner;
class lowest{
    public static void main(String args[]){
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter 1 No.");
        int A = Sc.nextInt();
        System.out.println("Enter 2 No.");
        int B = Sc.nextInt();
        System.out.println("Enter 3 No.");
        int C = Sc.nextInt();
        System.out.println("Enter 4 No.");
        int D = Sc.nextInt();
        if((A<B)&&(A<C)&&(A<D)){
            System.out.println("Lowest no."+A);
        }
         else if ((B<A)&&(B<C)&&(B<D)){
            System.out.println("Lowest No."+B);
        }
         else if ((C<A)&&(C<B)&&(C<D)){
            System.out.println("Lowest NO. "+C);
        }
        else {
            System.out.println("Lowest No. "+D);
        }


    }
}