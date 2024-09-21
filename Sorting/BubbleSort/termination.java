/* Early Termination Optimization:

Modify your Bubble Sort algorithm to stop early if the array becomes sorted before the end of the passes. This can be done by checking if there were no swaps in a pass.
Test it with: [10, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9].
 */

public class termination {
    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        }
        public static void bubblesort(int arr[]){
            for(int turn = 0; turn<arr.length-1; turn++){
                int swap = 0; // add swap variable and note the swaps if there are no swaps then stop the loop.
                for(int j = 0; j<arr.length - 1 - turn; j++){
                    if(arr[j] > arr[j+1]){
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swap++;
                    }
                }
                System.out.println("No of swaps = " + swap);
                if(swap == 0){
                    break;
                }
                
            }
        }
        public static void main(String[] args) {
            int arr[] = {10, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            bubblesort(arr);
            print(arr);
        }

}
