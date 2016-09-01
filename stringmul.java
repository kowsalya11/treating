public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int g[]=new int[10];
    int i=1; int temp,z=0,sum=0;
    while(a!=0){
        temp=a%10;
        a=a/10;
       z=temp*i;
       sum=sum+z;
       i++;
       }System.out.println(" "+sum);
       if(sum%11==0){
           System.out.println("isbn number");
       }
       else{
           System.out.println("not a isbn number");
       }
    }}