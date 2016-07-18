
    public static void main(String[] args) {
        String s;
        int i,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter thebString to be reversed");
        s=sc.nextLine();
     String s1=new StringBuffer(s).reverse().toString();
        System.out.println("the reversable String is "+s1);
        char[] c1=s1.toCharArray();
        t=s1.length();;
        
        for(i=0;i<t;i++)
        {if(c1[i]=='a'||c1[i]=='e'||c1[i]=='i'||c1[i]=='o'||c1[i]=='u')
           c1[i]='\0';
        
           
        }  System.out.println("after removed vowel from the reversed string is");
        for(i=0;i<t;i++)
        {
            System.out.print(""+c1[i]);}
        
     }
    
}
