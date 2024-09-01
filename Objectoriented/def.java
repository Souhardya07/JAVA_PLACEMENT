package Objectoriented;
class Box{
    double h;
    double w;
    double d;
    Box( double height,double width,double depth){
       h =height;
       w = width;
       d = depth;
    }
    Box(double length){
        h = length;
        w = length;
        d = length;
    }
    void volume(){
        System.out.println(h*w*d);
    }
}
class def {
    public static void main(String[] args) {
        Box ob = new Box(2,3,4);
        /*The constructor containing the parameters (There are three parameters here )  */
        Box ob1 = new Box(6);
        /*the constructor box with the single parameter is assigned for the object ob */
        ob.volume();
        ob1.volume();     
    }
}
