public class reverseleetcode {
    public static void main(String[] args) {
        int a = -1290;
        reverse(a);
        System.out.println(reverse(a));
    }
    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int temp = x % 10;
            
            // Check for overflow
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && temp > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && temp < -8)) {
                return 0;
            }
            
            reversed = (reversed * 10) + temp;
            x = x / 10;
        }
        return reversed;
    }
    

}
