class Poly{
    double a;
    double b;
     
     double cal ( ){
        return(a*b);
     }
     int  cal (int x , int y){
        a= x;
        b =y;
        return(x+y);
     }
     
}
class Calculate{
    public static void main(String[] args) {
        Poly ob = new Poly();
          System.out.println(ob.cal(4,5));
          System.out.println(ob.cal());
    }
}