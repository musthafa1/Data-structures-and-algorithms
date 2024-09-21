/* Sort Strings Alphabetically:

Modify Bubble Sort to sort an array of strings alphabetically.
For example, sort the array: ["apple", "banana", "pear", "orange", "lychee", "avocado", "jackfruit", "cherries"].

*/
public class sortstrings {
    public static void print(String arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        }
        public static void bubblesort(String arr[]){
            for(int turn = 0; turn<arr.length-1; turn++){
                for(int j = 0; j<arr.length - 1 - turn; j++){
                    String a = arr[j]; String b = arr[j+1];
                    if(a.charAt(0) > b.charAt(0)){
                        //swap
                        String temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                       
                    }
                }
                
            }
        }
        public static void main(String[] args) {
            String arr[] = {"apple", "banana", "pear", "orange", "lychee", "avocado", "jackfruit", "cherries"};
            bubblesort(arr);
            print(arr);
        }
}
