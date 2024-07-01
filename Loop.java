//print all the values between 1 and 50 except for the multiples of 3 .
import java.util.Scanner;
public class Loop {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int num= 0;
    while(n>0){
      n=n/10;
      num++;
    }
    System.out.println(num);
  }

}
