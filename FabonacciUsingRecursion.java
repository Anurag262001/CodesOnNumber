import java.lang.reflect.Array;
import java.util.Arrays;

class FabonacciUsingRecursion {
    int a=0;int b=1;int c;
    int num = 10;
    void fib(int num){
        if(num>=1){
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
            fib(num-1);
        }
    }    
    public static void main(String[] args) {
            FabonacciUsingRecursion obj  =new FabonacciUsingRecursion();
            obj.fib(10);
    }
}
