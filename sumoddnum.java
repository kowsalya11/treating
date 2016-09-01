 public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int i,sum=0;
       for(i=1;i<=a;i++){
           if(i%2!=0){
              // System.out.println(""+i);
               sum=sum+i;
                }
       }System.out.println(""+sum);
    }
    
} 