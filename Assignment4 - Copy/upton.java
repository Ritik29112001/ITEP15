import java.util.Scanner;
class upton{
    public static void main(String[]args){
        Scanner Sc =new Scanner(System.in);
        System.out.print("enter NO. upto");
        int n =Sc.nextInt();
        int i =1;
        while(i<=n){
            if(i%2==0)
            System.out.println(i);
            i++;
        }
    }
}