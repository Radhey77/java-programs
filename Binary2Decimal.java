import java.util.Scanner;
public class Binary2Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter binary no.");

        int binary_number = sc.nextInt();
        int ans= 0;
        int pw = 1;

        while(binary_number>0){
            int unit_digit = binary_number%10;
            ans += (unit_digit * pw);
            binary_number/=10;
            pw*=2;

        }
        System.out.println(ans);
        
    }
    
}
