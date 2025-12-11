import java.util.Scanner;
class series{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a n^th term");
        int n =Sc.nextInt();
        int a =0, b=1;
        System.out.print(a+" "+b +" ");
        int c=0;
        int i=0;
        while(i<=n){
            System.out.print((c=a+b)+" ");
            a=b;
            b=c;
            i++;
        }


    } 
}