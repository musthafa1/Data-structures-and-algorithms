/*Basic Bubble Sort Implementation:

Write a function to implement the Bubble Sort algorithm that sorts an array of integers in ascending order.

Test your function with an array: [64, 34, 25, 12, 22, 11, 90].

*/

class ascending {
    public static void print(int arr[]){
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    }
    public static void bubblesort(int arr[]){
        for(int turn = 0; turn<arr.length-1; turn++){
       
            for(int j = 0; j<arr.length - 1 - turn; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                   
                }
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubblesort(arr);
        print(arr);
    }
}