import java.util.Scanner;
class Q2{
    public static void main (String args[]){
    Scanner Sc = new Scanner (System.in);
    System.out.println("Enter Area");
    int A=Sc.nextInt();
    System.out.println("Enter Breath");
    int B=Sc.nextInt();
    int l = A/B;
    int P = 2*(l+B);
    System.out.println("Perameter is \n"+P);
     System.out.println("Length  is \n"+l);
     }
     




}