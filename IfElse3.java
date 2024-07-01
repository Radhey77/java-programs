import java.util.Scanner;
public class IfElse3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter any integer");
        int n = s.nextInt();
        if (n<0){
            n= n*(-1);
        }
        System.out.println(" the absolute value is  :: "+n );
    }
    
}
