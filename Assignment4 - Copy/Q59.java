
public class Q59 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 100;
        while (i <= 200) {
            if (i % 9 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}
