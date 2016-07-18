public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element");
        n=sc.nextInt();
        if(n>0)
            System.out.println("positive");
        else if(n<0)
            System.out.println("nagative");
        else if(n==0)
            System.out.println("equals to zero");
            
    }