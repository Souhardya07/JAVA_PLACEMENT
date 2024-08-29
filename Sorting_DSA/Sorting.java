public class Sorting {
   public static void main(String[] args) {
    int [] number = {7,8,3,1,2};

    // Bubble sort 

    //TIME COMPLEXITY : O(n^2)

    // for (int i =0 ; i< number.length-1;i++){
    //     for (int j= 0; j< number.length-i-1;j++){
    //         if(number[j]>number[j+1]){
    //             int temp= number[j];
    //             number[j] = number[j+1];
    //             number[j+1]= temp;
    //         }
    //     }
    // }
   
    // for (int i=0;i<number.length; i++){
    //     System.out.print(number[i]+ " ");
    // }
       
     // SELECTION SORT

     // TIME COMPLEXITY : 0(n^2)


    //  for (int i =0 ; i<number.length-1;i++){
    //     int min = i;
    //     for(int j = i+1; j<number.length;j++){
    //         if(number[min]> number[i]){
    //             min = j;
    //         }
    //     } 
    //     int temp = number[min];
    //     number[min]=number[i];
    //     number[i]=temp;
    //  }


      //Insertion sort 

      // TIME COMPLEXITY:

     for (int i =1; i<number.length;i++){
        int element = number[i];
        int j = i-1;
        while (j>=0 && element < number[j]){
            number[j+1] =number[j];
            j--;
        }
        number[j+1] = element;
     }

   }
}
  

