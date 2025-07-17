/*9. Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).*/

import java.util.Scanner;
class Alfa{
    public static void main(String args[]){
        Scanner Mp =new Scanner(System.in);
        System.out.println("Enter Character");
        char X = Mp.next().charAt(0);
        
        if((X>='a')&&(X <='z')){
            System.out.println("Lowercase\n"+X);
        }
         else if ((X >='A')&&(X<='Z')){
            System.out.println("Uppercase\n"+X);
        }
        else{
            System.out.println("This Character is not in a Alfabeat" );
        }


    }
}