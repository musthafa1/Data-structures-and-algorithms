public class Binarysearch{
    public static int binary(int nums[], int key){
        int start = 0, end = nums.length-1;
        for(int i = start; i<=end; i++){
            int mid = (start + end)/2;
            if(nums[mid] == key){
                return mid;
            }
            if(nums[mid] < key){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {2,8,10,12,16,20,21};
        int key = 20;
        int index = binary(nums, key);
        if(index == -1){
            System.out.println("The key has not found");
        }else{
            System.out.println("The is at index : " + index);
        }
    }
}