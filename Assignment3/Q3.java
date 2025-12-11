//3.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.//
   //Ask user for their salary and year of service and print the net bonus amount.//


import java.util.Scanner;
class Q3{
    public static void main (String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Service year:");
        double sy = Sc.nextDouble();
        System.out.println("Enter our Salary:");
        double sa = Sc.nextDouble(); 

        if (sy > 5){
            double isa = (5.0/100.0)*sa;
            double net = sa+isa;
            System.out.println("congratulations your salary increase by 5%\n"+ net);
        }
        else{
            System.out.println("you need to Work hard\n");
        }
    }
}
