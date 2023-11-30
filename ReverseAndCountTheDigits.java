import java.lang.reflect.Array;
import java.util.Arrays;

class ReverseAndCountTheDigits{
    public static void main(String[] args) {
     int digit = 123;
     int rev=0;
     int count=0;
     while(digit!=0){
        count = count+1;
        rev = rev * 10 + digit %10;
        digit= digit/10;
     }
     System.out.println("number of digits are" + count);
     System.out.println(rev);
        }
    }    
