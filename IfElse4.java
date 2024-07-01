import java.util.Scanner;
public class IfElse4 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the cost price ");
        int cp = s.nextInt();
        System.out.println("enter the selling price ");
        int sp = s.nextInt();
        if(cp>sp){
            int loss = cp-sp;

            System.out.println("loss of :: "+loss);
        }
        else { 
            int profit = sp-cp;
            System.out.println("profit of ::: "+profit);
            
        }

    }
    
}
