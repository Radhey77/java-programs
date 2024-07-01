public class Arraysextentented {
    public static void main (String args[]){
        // int nums[]= {1,2,3,4,5};
        // for(int n:nums){
        //     System.out.println(n);
        // }

        int nums[][]={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
        for(int a[]:nums){
             for (int b:a){
                System.out.print(b+" ");
             }
             System.out.println(" ");
        }
    }
    
}
