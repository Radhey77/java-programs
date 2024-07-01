public class Fibonachi {
    public static void main(String [] args){

        int num = 15;
        int a=0,b=1;
        System.out.print(a+","+b+",");
        int nextnum;

        for (int i = 2 ; i<num;i++){
            nextnum= a+b;
            a=b;
            b=nextnum;
            System.out.print(nextnum+",");


        }

    }
    
}
