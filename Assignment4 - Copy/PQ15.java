class Pattern{
    public static void main(String[] args) {
        int n = 5;
        char start =64;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                start =(char)(64+i) ; 
                System.out.print(start);
                
            }
            System.out.println();
        }
    }
}