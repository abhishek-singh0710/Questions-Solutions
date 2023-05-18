/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static String check(long m,long n)
    {
        String y="YES";
        String h="NO";
        while(m%2==0)
        {
            m=m/2;
        }
        if(n%m==0)
        {
            return y;
        }
        return h;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		for(long i=0;i<t;i++)
		{
		    long m=sc.nextLong();
		    long n=sc.nextLong();
		    if(m==n)
		    {
		        System.out.println("YES");
		    }
		    if(m%2!=0 && m!=n && m>n)
		    {
		        System.out.println("NO");
		    }
		    if(m<n)
		    {
		        System.out.println("NO");
		    }
		    if(m%2==0 && m>n)
		    {
		        System.out.println(check(m,n));
		    }
		}
	}
}
