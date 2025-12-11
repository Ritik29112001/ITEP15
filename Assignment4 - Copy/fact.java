import java.util.Scanner;
class fact{
    public static void main(String []args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter how many even no you want");
        int n = Sc.nextInt();
        int i=1;
        while(i<=(n*2)){
            if(i%2==0){
            System.out.println(i);
            }
            i++;
        }

    }
}