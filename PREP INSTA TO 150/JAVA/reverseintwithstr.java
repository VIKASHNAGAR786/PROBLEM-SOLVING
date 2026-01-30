public class reverseintwithstr {
    public static void main(String args[]){
        int number = 234567;
        int digit = 0;
        String result = "";
        while(number != 0){
            digit = number%10;
            result += digit; 
            number = number/10;
        }
        System.out.println("reverse integer is " + result);
    }
}
