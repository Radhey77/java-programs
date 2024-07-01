public class DemoVariables {
    static int a= 10;
    int b = 20;
    static void m1(){
        System.out.println( "m1()");

        System.out.println( "value of a ="+a);
    }
 void m2(){
    System.out.println( "m2()");

    System.out.println( "value of a ="+a);
    System.out.println( "value of b ="+b);


 }
    public static void main(String[] args ){
        DemoVariables obj = new DemoVariables();
        obj.m2();
        DemoVariables.m1();

    }
}
