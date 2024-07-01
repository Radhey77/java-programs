import java.util.Scanner;
public class IfElse5 {
    public static void main(String []  args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the length");
        int l = s.nextInt();
        System.out.println("enter the width");
        int w = s.nextInt();
        int a=l*w;
        int p=2*(l+w);
        if (a>p){
            System.out.println("area is greater than perimeter "+a);
        }
        else {
            System.out.println("perimeter is greater than area"+p);
        }
    }
    
}
