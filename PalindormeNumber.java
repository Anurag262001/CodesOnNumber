class PalindormeNumber{
    public static void main(String[] args) {
        int num = 11;
        int store = num;
        int resultrev=0 ;
        while(num!=0){
            resultrev = resultrev * 10 +num % 10;
            num = num/10;
        }
    if(store==resultrev){
        System.out.println("palindrome");
    }else{
        System.out.println("not the palindorme");
    }
    }
    
}