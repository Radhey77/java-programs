import java.util.Scanner;
public class IfElse1 {
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if (x%11==0){
            System.out.println("yes the number is divisible by 11");
        }
        else{
            System.out.println("the number is not divisible by 11");
        }

    }
    
}
