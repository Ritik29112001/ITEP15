import java.util.Scanner;

 class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter garden side (m): ");
        int garden = sc.nextInt();

        System.out.print("Enter pool side (m): ");
        int pool = sc.nextInt();

        int gardenArea = garden * garden;
        int poolArea = pool * pool;
        int remaining = gardenArea - poolArea;

        System.out.println("Area of garden = " + gardenArea + " m²");
        System.out.println("Area of pool = " + poolArea + " m²");
        System.out.println("Remaining area = " + remaining + " m²");
    }
}
