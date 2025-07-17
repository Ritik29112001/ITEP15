import java.util.Scanner;

 class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter (cm): ");
        float d = sc.nextFloat();

        System.out.print("Enter height (cm): ");
        float h = sc.nextFloat();

        float r = d / 2;
        float pi = 3.14f;
        float volume = pi * r * r * h;

        System.out.println("Volume = " + volume + " cm³");
    }
}
