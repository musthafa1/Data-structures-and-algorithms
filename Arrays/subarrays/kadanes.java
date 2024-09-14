public class kadanes {
    public static void max(int nums[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0; i<nums.length; i++){
            currsum = currsum + nums[i];
            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println("Maxsum = "+ maxsum);
    }
    public static void main(String args[]){
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        max(nums);
    }
    
}
