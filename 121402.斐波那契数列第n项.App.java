import java.util.Scanner;

public class java121402 {
    public static void main(String[] args) {
        int n,fn;
        java.util.Scanner s = new Scanner(System.in);
        n=s.nextInt();
        fn=function(n);
        if (n>=1&&n<=40){
            System.out.println("斐波那契数列第"+n+"项为："+fn);
        }else {
            System.out.println("你输入的数大于40！");
        }
    }
    public static int function(int n){
        if(n == 0){
            return 0;
        }else if(n == 1 || n == 2){
            return 1;
        }else{
            return  function(n-2) + function(n- 1);
        }
    }
    }




