import java.util.*;

    class EmployeSalary {
        float calculate(int bSal){
            float tSal = bSal+(0.93F*bSal)+(0.63F*bSal);
             return tSal ;
        }

    
    }
    public class DemoMethods1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("enter basic salary");
        int bS =s.nextInt();
        if(bS >=12000)
        {
           EmployeSalary es = new EmployeSalary();
           float tsal = es.calculate(bS);
           System.out.println("total salary  = "+ tsal);
        }
        else{
            System.out.println("invalid salary");
        }
    }
    
}
