public class Fibonacci{
    public static void main(String args[]){
    int n0 = 0 ;
    int n1 = 1;
    int n3 ;
    int count=10;
    System.out.println(n0 + " " + n1);
    for (int i= 0; i <= count; ++i){
       n3 = n0 + n1;
       System.out.println(" " + n3);

       n0 =n1;
       n1 = n3;
       
    }
 }
}