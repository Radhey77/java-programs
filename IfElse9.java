import java.util.Scanner;
public class IfElse9 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter x1");
        int x1 = s.nextInt();
        System.out.println("enter x2");
        int x2 = s.nextInt();
        System.out.println("enter x3");
        int x3 = s.nextInt();
        System.out.println("enter y1");
        int y1 = s.nextInt();
        System.out.println("enter y2");
        int y2 = s.nextInt();
        System.out.println("enter y3");
        int y3 = s.nextInt();
        if (( y2-y1)/(x2-x1)==(y3-y2)/(x3-x2)   ){
            System.out.println("its a straight line");
        }


    }

    
}
