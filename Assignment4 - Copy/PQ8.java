import java.util.Scanner;
class Pattern{
    public static void main (String []args){
        Scanner Sc =new Scanner(System.in);
        int n= Sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                System.out.print(" * ");
                }
                else
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}