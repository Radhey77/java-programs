import java.util.Scanner;
public class IfElse6 {
    public static void main(String []  args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no.");
        int x = s.nextInt();
        if (x<1000&&x>99){
            System.out.println("its a three digit no");

        }
            else{
                System.out.println("its not a three digit no.");
            }
        
    }
    
}
