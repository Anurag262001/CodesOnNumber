import java.lang.reflect.Array;
import java.util.Arrays;

class FactorialUSingRecursion {
    static int fact=1;
    void number(int num) {
    
        if (num >= 1) {
            fact = fact * num;
            number(num - 1);

        }
    }

    public static void main(String[] args) {
        int num = 10;
        FactorialUSingRecursion obj = new FactorialUSingRecursion();
        obj.number(10);
        System.out.println(fact);
    }
}
