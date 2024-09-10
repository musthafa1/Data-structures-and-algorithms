import java.util.Arrays;

public class startandend {
    public static int[] findindex(int arr[], int key){
        int n = arr.length;
        int start = -1;
        //traverse from begining to find first occurrence

        for(int i = 0; i<=n; i++){
            if(arr[i] == key){
                start = i;
                break;
            }
        }

        //traverse from end to find last occurrence
        int end = start;
        for(int i = n-1; i>=0; i--){
            if(arr[i] == key){
                end = i;
                break;
            }
        }
        int output[] = new int[2];
        output[0] = start;
        output[1] = end;
        return output;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,5};
        int key = 5;
        int index[] = findindex(arr, key);
       System.out.print(Arrays.toString(index));
    }
}
