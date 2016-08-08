 while(p!=0)
        {
            n1=p%10;
            p=p/10;
            sum+=n1;
        }int sum2=sum;
        while(sum!=0)
        {
            n1=sum%10;
            rev=rev*10+n1;
            sum=sum/10;
        }if(sum2==rev)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
