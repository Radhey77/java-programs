import java.util.Scanner;
public class IfElse8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the integer");
        int x = s.nextInt();
        if ((x%3==0)&&(x%5==0)){
            if (x%15==0){
                System.out.println("the number is divisible by 3 , 5 and 15");
            }
            else{
                System.out.println("the number is divisible by 3 and 5 both but not 15");
            }

        }
    }
    
}
