public class sorting {
    public static void main(String[] args) {
        int[] arr = {3,5,7,4,1,2,6};
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n;i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i]>arr[j]){
                    // temp = arr[i];
                    // arr[i] = arr[j];
                    // arr[j] = temp;

                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                    
                }
            }
        }
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
