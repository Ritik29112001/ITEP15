import java.util.Scanner;
class revers{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter revers from:");
        int n =Sc.nextInt();

        while(n>=1){
            System.out.print(n+" ");
            n--;
        }
    }
}