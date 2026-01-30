public class reversearr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        reversedArray(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
       }

    public static void reversedArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(end > start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
