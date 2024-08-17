
public class Reverse {
   public static void main(String[] args) {
     StringBuilder sb = new StringBuilder("Hello");
     for (int i = 0 ; i<sb.length()/2;i++){         // String should go for half of the String 
        int front =i;                           // front is the starting part 
        int back = sb.length()-1-i;             // the end of the string 

        char frontchar = sb.charAt(front);        // putting the charecter atr the front of the string in a variable Frontchar
        char backchar = sb.charAt(back);          // putting the chareccter at the back of the string in a variable Backchar 

        sb.setCharAt(front, backchar);             // Putting the value of the backchar into the first position using the setcharecter function
        sb.setCharAt(back, frontchar);
     }
     System.out.println(sb);
   }
}
