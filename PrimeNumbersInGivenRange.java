class PrimeNumbersInGivenRange{
    public static void main(String[] args) {
for(int i=10;i<=20;i++){
  int flag=0;
  for(int j=1;j<=i;j++){
    if(i%j==0){
      flag = flag+1;
    }
  }
   if(flag==2){
    System.out.println("prime numbers are"+ i);
  }
}
    }
}