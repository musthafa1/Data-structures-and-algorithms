public class printsubarray{
    public static void print(int numbers[]){
        for(int i = 0; i<=numbers.length-1; i++){
            int start = i;
            for(int j = i; j<=numbers.length-1; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,7,8,10};
        print(numbers);
    }
}