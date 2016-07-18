 while(n1!=0)
        {
            n2=n%10;
            n3=n2*n2*n2;
            sum+=n3;
            n1=n1/10;
            
        }
        if(sum==a)
            System.out.println("armstrong");
        else
            System.out.println("not armstromg");
       