import java.util.Scanner;
class series{
    public static void main(String []args){
        Scanner Sc= new Scanner(System.in);
        System.out.print("Enter no. of series do you have");
        int n = Sc.nextInt();
        int i;
        int term=1;
        for(i=1;i<=n;i++){
            
            System.out.print("\t"+term+" ");
            term=(term*10)+1;
            
        }

}



}