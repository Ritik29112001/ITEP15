import java.util.Scanner;

 class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the park: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth of the park: ");
        int b = sc.nextInt();

        int oneRound = 2 * (l + b);
        int total = oneRound * 10;
        float km = total / 1000.0f;

        System.out.println("Total jogging distance = " + km + " km");
    }
}
