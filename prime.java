public class prime{
public static void main(String args[] ){

//Print all prime numbers between 1 and 100.
int count = 0;
for(int i=1;i<=100;i++){
count = 0;
for(int j =1;j<=i;j++){
    if(i%j==0){
    count++;
    }
}
if(count==2){
    System.out.println(i);
}
}
}
}