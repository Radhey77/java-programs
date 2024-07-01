import java.util.Scanner;
class TotalMarks{
    int add(int sub1 , int sub2 ,int sub3 , int sub4 , int sub5 , int sub6 ){
       int  tMarks = (sub1 +sub2 + sub3+ sub4+ sub5 + sub6 );
       return tMarks ;
    }
}
class Percentage{
    float calculate(int tMarks){
    float per = tMarks/6;
    return per ;
}
}
  
class  StudentResult{
    String generate(float per){
if (per>70){
    return "Destinction" ;

}
else if (per>60&&per<70){
    return  "First Class" ;
}
else if (per >50 &&per<60){  
    return  "Second cLass";
}
else if (per >35&&per<50){
    return "third cLass";
}
else {return "fail";}
       
    }
}


public class DemoMethods3 {

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        System.out.println("enter subjects 1");
        int s1 = s.nextInt(); 

        System.out.println("enter subjects 2");
        int s2 = s.nextInt(); 

        System.out.println("enter subjects 3");  
              int s3 = s.nextInt(); 

        System.out.println("enter subjects 4");
        int s4 = s.nextInt(); 

        System.out.println("enter subjects 5");
        int s5 = s.nextInt(); 

        System.out.println("enter subjects 6");
        int s6 = s.nextInt(); 


    if ((s1>0&&s1<100)&&(s2>0&&s2<100)&&(s3>0&&s3<100)&&(s4>0&&s4<100)&&(s5>0&&s5<100)&&(s6>0&&s6<100)){
     TotalMarks ob1=new TotalMarks();
     int tMarks = ob1.add(s1,s2,s3,s4,s5,s6);
     Percentage ob2 = new Percentage();
     float per =ob2.calculate(tMarks);
     StudentResult ob3 = new StudentResult();
     String result = ob3.generate(per);
     System.out.println(" result :::::");
     System.out.println("total marks obtained  ="+tMarks);
     System.out.println("percentage obtained  ="+per);
     System.out.println("result obtained  ="+result );

     

    }
    else {
        System.out.println("invalid marks");
    }


    }
    
}
