/*
 Find the k-th Largest Element:

Use Bubble Sort to find the k-th largest element in an unsorted array. For example, find the 3rd largest element in [3, 2, 1, 5, 6, 4].

 */
public class kthlargest {
    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        }
        public static int klargest(int arr[], int k){
            bubblesort(arr);
            return arr[k - 1];
        }
        public static void bubblesort(int arr[]){
            for(int turn = 0; turn<arr.length-1; turn++){
              
                for(int j = 0; j<arr.length - 1 - turn; j++){
                    if(arr[j] < arr[j+1]){
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        
                    }
                }
            }
        }
        public static void main(String[] args) {
            int arr[] = {3, 2, 1, 5, 6, 4};
            int k = 3;
            bubblesort(arr);
            print(arr);
            int result = klargest(arr, k);
            System.out.println("The " + k + "-th largest element is : " + result );
        } 
}
