/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamaleeswari
 */import java.util.*;
public class stringmax {
    
    public static void main(String[] args) {
        String s;
        
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        System.out.println(""+maxrep(s));
    }public static int maxrep(String s)
            {
 String s1=s;int count=1;
 char[] a=s1.toCharArray();
 int t=a.length;int[] b=new int[t]; 
 for(int i=0;i<t-1;i++){ count=1;

 for(int j=i+1;j<t;j++)
 {     if(a[i]==a[j])
     {count++;
     }  // System.out.println("b"+count);
 }  b[i]=count;
}

       Arrays.sort(b);
       int t1=b.length;
                //System.out.println(""+t1);
     return b[t1-1] ;
            }}
