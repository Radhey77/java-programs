import java.util.Scanner;
public class IfElse2 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the year ");
        int year = s.nextInt();
        if (year%4==0){
            System.out.println(year  +" ==its a leap year");
        }
        else{
            System.out.println(year+  "=  its not a leap year");
        }
    }
    
}
