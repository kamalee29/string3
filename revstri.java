
  public static void main(String[] args) {
        String str3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter thebString to be reversed");
        str3=sc.nextLine();
     String s1=new StringBuffer(str3).reverse().toString();
        System.out.println("the reversable String is "+s1);
    }