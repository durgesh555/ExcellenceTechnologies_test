

 class MaxConsecutiveNumber {

    public static void main(String[] args) {
       int x[] = {0,0,0,1,1,0,1,1,1,1,0};
      int result =0; int count=0;
     
      for (int y:x){
          if (y==1){
              count++;
              if(count>result){
                  result=count;
              }
          }else{
              count=0;
          }
      }
        System.out.println(result);
    }
   
}