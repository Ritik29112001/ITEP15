import java.util.Scanner;

 class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius (cm): ");
        int r = sc.nextInt();

        System.out.print("Enter height (cm): ");
        int h = sc.nextInt();

        float pi = 3.14f;
        int r2 = r * r;

        float volume = pi * r2 * h;

        System.out.println("Volume = " + volume + " cm³");
    }
}
