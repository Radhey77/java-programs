import java.util.Scanner;
public class Dec_Binary {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int decimal_number = s.nextInt();
        int ans = 0;
        int pw = 1;
        while(decimal_number>0){
            int parity = decimal_number % 2 ;
            ans += (parity*pw);
            pw *= 10;
            decimal_number/=2;


        }
        System.out.println(ans);
    }
}
