import java.util.*;
class Greater {
int compare(int x,int y,int z){
    if (x>y&&x>z){
        return x;
    }
   else  if (y>x&&y>z){
        return y;

    }
    else{
        return z;
    }

}

}
class DemoMethods2{

    public static void main(String []  args){
        Scanner s= new Scanner(System.in);

        System.out.println("Enter three Integer");
        int v1 = s.nextInt();
        int v2 = s.nextInt();
        int v3 = s.nextInt();

        if ( v1>0&&v2>0&&v3>0){
            Greater g = new Greater();
            int gi = g.compare(v1,v2,v3);
            System.out.println("greater value ="+ gi);


        }
        else {
            System.out.println("invalid Integers");
        }

    }
}