import java.util.Scanner;
class Pattern{
    public static void main (String [] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter No. of star");
        int n = Sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(" * ");
        }

    }
}