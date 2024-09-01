// package Objectoriented;
// class Box {
//     double h,w,d;
//    double volume(){                                        // this volume method don't have any parameters 
//         h =1;
//         w = 1;
//         d =1;
//         return(h*w*d);
//     }
//     double volume (double len){                            // the method which has the parameter len                                                       // ALL THESE THREE VOLUME METHOD HAVE THE SAME RETURN TYPE THUS IT IS NOT RETURN TYPE THAT DETERMINES THE METHOD OVERLOADING 
//         h = len;
//         w = len;
//         d = len;
//         return (h*w*d);
//     }
//     double volume (double height,double width,double depth){                 // the method which has a parameters height, width, depth.
//         h = height;
//         w = width;
//         d = depth;
//         return (h*w*d);
//     }
// }
// /* The Above example i of the example of 
//   method overloading which is used in the 
//   concept of POLYMORPHISM   where Poly means 
//   many and the word morph means form .
 
//  */
//  class ghi {
//     public static void main(String[] args) {
//         Box ob = new Box();
//         System.out.println(ob.volume());
//         System.out.println(ob.volume(6));
//         System.out.println(ob.volume(3,6,5));
//     }
// }
