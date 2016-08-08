
    public static void main(String[] args) {
        System.out.println("");
       // postion p=new postion();
        int a,b,c,i,count=0;
        
     Scanner sc=new Scanner(System.in);
             System.out.print("enter the first element in array ");
             a=sc.nextInt();
             System.out.println("enter how many terms u want");
             b=sc.nextInt();
             int[] m=new int[b];
             System.out.println("enter the increasing value");
             c=sc.nextInt();
             System.out.print(" "+a);
             for(i=1;i<b;i++)
             {
                 m[i]=a+c;
                 System.out.print(" "+m[i]);
                 a=m[i];
                 

    }for(i=0;i<b;i++)
             {
                 if(m[i]==i)
                 System.out.print("the value"+m[i]+"istrue");
                 count=1;
                     
                 

    }if(count==0)
            System.out.println("false");
              
    
}}
       
    
     
     


