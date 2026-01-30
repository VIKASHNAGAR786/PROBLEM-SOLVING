import java.util.ArrayList;
import java.util.List;

public class printsubset {
    public static void printsubsets(List<Integer> arr, List<Integer> ans, int i){
        if(i == arr.size()){
            for(int val : ans){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        ans.add(arr.get(i));
        printsubsets(arr, ans, i + 1);

        ans.remove(ans.size() - 1);

        printsubsets(arr, ans, i + 1);
    }

    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        // Initialize the answer list
        List<Integer> ans = new ArrayList<>();

        // Start the recursion from index 0
        printsubsets(arr, ans, 0);
    }
}