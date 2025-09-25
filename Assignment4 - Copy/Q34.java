import java.util.Scanner;
class per{
    public static void main(String []args){
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter no is perfect or not");
    int n = Sc.nextInt();
    int sum = 0;
    int i;
    for(i=1;i<n;i++)
    {if(n%i==0)
    sum=sum+i;
    }
    if(sum==n)
    System.out.println("No. is perfect");
    else
     System.out.println("No. is not perfect");
                   
    }  
    

}