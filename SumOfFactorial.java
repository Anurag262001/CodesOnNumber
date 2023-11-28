class SumOfFactorial{
    public static void main(String[] args) {
        int number = 3;
        int fact = 1;
        int sum = 0;
        for(int i=1;i<=number;i++){
            fact  = fact*i;
            sum = sum+fact; 
        }
        System.out.println(sum);
    }    
}