import java.util.Scanner;

public class IfElse7 {
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter the no.");
        int x = s.nextInt();
        if (x%3==0 && x%5==0){
            System.out.println("the number. is divisible by 3 and 5");
        }
        else if(x%3==0){
            System.out.println("the number. is dividible by 3 only");
        }
        else if(x%5==0){
            System.out.println("the number. is divisible by 5 only");

        }
        else{
            System.out.println("the number. is not divisible by 3 and 5");
        }
    }
    
}
