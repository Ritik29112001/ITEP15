class Q6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        int c = 17;

        int s = (a + b + c) / 2;
        int x = s * (s - a) * (s - b) * (s - c); 
        int area = 36;  

        System.out.println("Area = " + area + " cm²");
    }
}
