import java.util.Scanner;
class Area {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a length of rectangle");
int l=sc.nextInt();
System.out.println("Enter a breath");
int b=sc.nextInt();
int A=l*b;
System.out.println("teh area of rectangle\n" + A);
int P=2*(l+b);
System.out.println("The perameter is\n" + P);}
}