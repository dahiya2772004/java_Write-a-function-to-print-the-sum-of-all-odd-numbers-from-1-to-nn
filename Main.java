import java.util.*;
class yay{
    public static void printSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);

    }
    public static void main(String[] args){
        Scanner scr =new Scanner(System.in);
        int n= scr.nextInt();
        printSum(n);





    }
}
