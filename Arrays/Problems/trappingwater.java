public class trappingwater{
    public static int trapped(int height[]){
        //calc left max 
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i = 1; i<height.length; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        // calc right max
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        
        int trappedwater = 0;
        for(int i = 0; i<height.length; i++){
            //calc water level
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            //calc trapped water
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        int water = trapped(height);
        System.out.println("The water trapped = " + water);

    }
}