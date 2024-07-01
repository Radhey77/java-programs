import java.util.Scanner;


class Addition {
    int add(int x, int y){
        return x+y;
    }

}

class Subtraction{
    int sub(int x , int y){
        return x-y;
    }
}
class Multiply {
    int multiply(int x, int y){
        return x*y;
    }
}
class Division {
    float division(int x , int y){
        return (float) x/y;

    }
}
class ModDivision{
    int modDivision(int x , int y){
        return x%y;
    }
}

public class DemoMethods4 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter integer1");
        int x = s.nextInt();
        System.out.println("enter integer1");
        int y = s.nextInt();

        System.out.println("enter choice==" );
        System.out.println("1.add 2.sub 3.multiply 4.division 5.moddivision");
        int choice = s.nextInt();
        switch(choice){
case 1 :
       Addition ad = new Addition();
       int add = ad.add(x, y);
       System.out.println(add);
break;
case 2 :Subtraction sb = new Subtraction();
     int sub = sb.sub(x,y);
     System.out.println(sub);

break;
case 3 : Multiply mp = new Multiply();
   int multiply = mp.multiply(x,y);
   System.out.println(multiply);
break;
case 4 : Division dv = new Division();
   float division = dv.division(x,y);
   System.out.println(division);
break ;
case 5 :ModDivision md = new ModDivision();
      int modDivision = md.modDivision(x,y);
      System.out.println(modDivision);
break ;
default : System.out.println("invalid input");

        }

    }
    
}
