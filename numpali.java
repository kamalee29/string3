
   public static void main(String[] args) {
       int n,i,num,rev=0,rev1=0;
        //int[] rev1=new int[10];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int n1=n;
        //for(i=0;i<n;i++)
        while(n1!=0)
        {
            num=n1%10;
            rev1=rev*10+num;
            n1=n1/10;
            System.out.print(""+rev1);
        rev=0;
        }
        if(n==rev1)
        {
            System.out.println("palindrome");
            
        }else
            System.out.println("not palindrome");
}