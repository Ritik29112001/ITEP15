import java.util.Scanner;

 class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = 300;
        int b = 150;
        int area = l * b;

        System.out.print("Enter rate per 100 sq.m: ");
        int rate = sc.nextInt();

        int cost = (area * rate) / 100;

        System.out.println("Total Cost = ₹" + cost);
    }
}
