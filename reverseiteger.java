public class reverseiteger{
    public static void main(String[] args) {
        int x = 1320;
        int r = 0;

        while(x>0){
            r = x%10;
            System.out.print(r);
            x = x/10;
        }
    }
}