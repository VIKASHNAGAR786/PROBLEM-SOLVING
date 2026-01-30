public class threesum {
    public static void main(String[] args) {
        int[] arr = {-4,-1,-1, 0, 1, 1, 2 };
        for(int i = 0; i<arr.length-1;i++){
            for(int k = i+1; k< arr.length-1;k++){
                for(int j = k+1; k < arr.length-1;k++){
                    int res = arr[i]+arr[k]+arr[j];
                    if (res == 0) {
                        System.err.println(""+arr[i]+","+arr[k]+","+arr[j]); 
                    }
                }
            }
        }
    }
    
}
