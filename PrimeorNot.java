class PrimeorNot{
    public static void main(String[] args) {
      int num = 15 ;
      int flag = 0;
      for(int i=1;i<=num;i++){
        if(num%i==0){
          flag=flag+1;
        }
      }
if(flag==2){
  System.out.println("prime number");
}else{
  System.out.println("not the prime number");
}
    }
}