 class Q3 {
public static void main(String []args){
    String s ="Hello 1 Word 2 java 3 ritik 8 ramesh 3";
    String x[] = s.split(" ");
    int sum =0;
    
    for(int i=0;i<x.length;i++){
        try{
        sum += Integer.parseInt(x[i]); 
        }
        catch(Exception e){
            //System.out.println(e.getMessage());
        }
        
    }
    System.out.println(sum);

}     
}
