
   public static void main(String[] args) {
        int b,i,k=0,j,c,x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        b=sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int[b];
        for(i=0;i<b;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number of time to be rotated");
        c=sc.nextInt();
        for(i=0;i<=c;i++){        x=a[0];{

                   for(j=0;j<b-1;j++){
                        a[j]=a[j+1];
                   }   a[j]=x; 
                           
                       }
 
         
        } for(i=0;i<b;i++)
        {
            System.out.print(""+a[i]);
        }
    }