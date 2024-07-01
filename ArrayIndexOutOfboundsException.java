public class ArrayIndexOutOfboundsException {
    public static void main (String args[]){
        int nums[]={5,4,3,2};
        // for (int i=0;i<=nums.length-1;i++){
        //     System.out.println(nums[i]);
        // }
        for (int i : nums) {
            System.out.println(i);
            
        }
    }
    
}
