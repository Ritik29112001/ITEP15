import java.util.Scanner;

class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter number of terms to display: ");
        int terms = scanner.nextInt();
        
        int count = 1;
        for (int i = 1; i <= terms; i++) {
            if (count == 5) {
                System.out.print("Hello ");
                count = 1;
            } else {
                System.out.print(i + " ");
            }
            count++;
        }
    }
}
