public static void main(String[] args) {
          int n,i = 0,a,b,j,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the starting element");
        a=sc.nextInt();
          System.out.println("enter the ending element");
          b=sc.nextInt();
          for(j=a;j<=b;j++){
        for(i=2;i<b;i++){
        if(j%i==0)
        {
           break;
        }}
        if(j==i){
           // System.out.print(""+i);
                   count++;}
        else
       {  continue;}
        
    }
if(count==0)
{
    System.out.println("no prime numbers");
}else
                System.out.println("the number of prime numbers between"+a+"and"+b+" "+count);
            }
    
}
