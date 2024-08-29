
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("The number is " + n);
        if(n==0 || n==1){
        System.out.println(n + "is not prime");
    }else if(n%2 == 0)
    {
                System.out.println(n + "is a prime ");  
            
        }
        else {
            System.out.println(n+ "is not prime number ");
        }
    }
  } 

