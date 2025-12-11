import java.util.Scanner;
class series{
    public static void main(String[]args){
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter no. 1");
    int n=Sc.nextInt();
    int i = 1;
    float sum =0;
    while(i<=n)
    {
     sum = 1f/i+sum;
        i++;
    
    }
    System.out.println(sum);
    
    }
    }