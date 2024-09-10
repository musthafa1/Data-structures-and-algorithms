public class linearsearch{
    public static int linear(int numbers[], int key){
        for(int i = 0; i<=numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12};
        int key = 8;
        int index = linear(numbers, key);
        if(index == -1){
            System.out.println("The key has not found");
        }else {
            System.out.println("The key is at the index : " + index);
        }
    }
}