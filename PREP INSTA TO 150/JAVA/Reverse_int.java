class Reverse_int{
    public static void main(String args[]){
        int number = 234567;
        int digit = 0;
        int result = 0;

        while(number != 0){
            digit = number%10;
            result = (result*10)+digit;
            number = number/10;
        }
        System.out.println("reverse integer is " + result);
    }
}