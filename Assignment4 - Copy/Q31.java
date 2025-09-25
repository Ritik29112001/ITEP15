import java.util.Scanner;

class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter number of terms to display: ");
        int terms = scanner.nextInt();
        
        String num = "9";  
        for (int i = 1; i <= terms; i++) {
            System.out.print(num + " ");
            num += "9"; 
        }
    }
}
