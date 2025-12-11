import java.util.Scanner;

 class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter edge of cube: ");
        int a = sc.nextInt();

        System.out.print("Enter length of cuboid: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth of cuboid: ");
        int b = sc.nextInt();

        System.out.print("Enter height of cuboid: ");
        int h = sc.nextInt();

        int cubeVol = a * a * a;
        int cuboidVol = l * b * h;
        int diff = cubeVol - cuboidVol;

        System.out.println("Cube volume = " + cubeVol + " cm³");
        System.out.println("Cuboid volume = " + cuboidVol + " cm³");
        System.out.println("Difference = " + diff + " cm³");
    }
}
