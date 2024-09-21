/* Sort in Descending Order:

Modify the Bubble Sort algorithm to sort the array in descending order.
Test it with an array: [5, 1, 4, 2, 8].

*/
public class descending {
    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        }
        public static void bubblesort(int arr[]){
            for(int turn = 0; turn<arr.length-1; turn++){
           
                for(int j = 0; j<arr.length - 1 - turn; j++){
                    if(arr[j] < arr[j+1]){ // just change the logical operator to less than for descending.
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                       
                    }
                }
                
            }
        }
        public static void main(String[] args) {
            int arr[] = {5, 1, 4, 2, 8};
            bubblesort(arr);
            print(arr);
        }
    
}
