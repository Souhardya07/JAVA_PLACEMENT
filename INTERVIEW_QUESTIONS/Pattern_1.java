
import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        // for (int i =1 ; i<=rows;i++){
        //     for(int j=1 ; j<=i ;j++){
        //        System.out.print(j);
        //     }
        //     System.out.println(" ");
        // }

        // for(int i = 1; i<=rows;i++){
        //     for(int j=rows; j>=i;--j){
        //         if(i<j)
        //         System.out.print(j);
        //     }
        //     System.out.println(" ");
        // }

        // output 65432
                //6543
                //654
                //65
                //6

        // for (int i =rows ; i>=1 ;i--){
        //     for (int j = 1 ; j<i;++j){
        //         System.out.print(j);
        //     }
        //     System.out.println(" ");
        // }
        
        // Output
        //            12345
        //            1234
        //            123
        //            12
        //            1

        for (int i = rows ; i >=1 ; i--){
            for(int j = i ; j >=1 ; j--){
                System.out.print(j);
            }
                System.out.println(" ");
        }
    }
}
