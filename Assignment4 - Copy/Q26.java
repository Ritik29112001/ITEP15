import java.util.Scanner;

class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter number of terms to display: ");
        int terms = scanner.nextInt();
        
        
        System.out.println("The sequence is:");
        for (int i = 0; i < terms; i++) {
            int n = 2 * i;  
            int cube = n * n * n;  
            System.out.print(cube + " ");
        }
    }
}
