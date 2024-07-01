import java.util.Scanner;
public class DemoVariables2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

System.out.println("Enter product details ");
System.out.println("Enter product code");
int pcode = Integer.parseInt(s.nextLine());
System.out.println("Enter product name");
String pname = s.nextLine();
System.out.println("Enter product price");
float pprice =s.nextFloat();
System.out.println("Enter product quantity");
int qty = s.nextInt();


System.out.println("product code = "+pcode);
System.out.println("product name  ="+pname);
System.out.println("product price = "+pprice);
System.out.println("product quantity  ="+qty);


    }
    
}
