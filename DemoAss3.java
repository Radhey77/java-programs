import java.util.Scanner;
class GetLeastGreat{
    int getLeastGreat(int x, int y){
        if (x>y){
            return y;
        }
        else {
            return x;
        }
    }
} 

public class DemoAss3 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the integers");
        int x = s.nextInt();
        int y = s.nextInt();
        GetLeastGreat glg = new GetLeastGreat();
        int leastGreat = glg.getLeastGreat(x, y);
        System.out.println("Least greater  = "+ leastGreat);


    }
    
}
