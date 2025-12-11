import java.util.Scanner;

 class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = 13;
        int a = 12;

        int b = c * c - a * a;
        int other = b;  // side²

        int area = (a * 5) / 2;

        System.out.println("Other side² = " + other + " cm²");
        System.out.println("Area = " + area + " cm²");
    }
}
