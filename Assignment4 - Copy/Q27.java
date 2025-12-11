import java.util.Scanner;

class Q27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter number of terms to display: ");
        int terms = scanner.nextInt();
        
       
        System.out.println("The alternating sequence is:");
        for (int i = 0; i < terms; i++) {
            if (i % 2 == 0) {
                System.out.print("* ");
            } else {
                System.out.print("# ");
            }
        }
    }
}
