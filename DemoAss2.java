import java.util.Scanner;
public class DemoAss2 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the integers");
        System.out.println("enter the 1st integer ");
        int x = s.nextInt();
        System.out.println("enter the 2nd  integer ");
        int y = s.nextInt();
        if (x>y){
            System.out.println("greater Integer="  + x );
        }
        else {
            System.out.println("greater Integer  ="  + y);
        }

    }
    
}
