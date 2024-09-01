package Objectoriented;



class Test{
    int a;
    Test(int i){
        a =i;
    }
    Test incbyten(){
         Test temp = new Test(a+10);
         return temp;
    }
}
/* */
public class returntype {
    public static void main(String[] args) {
        Test ob = new Test(2);
        System.out.println(ob.a);
        Test ob1 = ob.incbyten();
        System.out.println(ob1.a);

    }
}
