package anudip;

import java.util.Scanner;

public class StringReverse {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=scanner.nextLine();

		char ch[] = str.toCharArray();
      for(int i=0;i<str.length();i++)
      {
    	  System.out.print(ch[i]);
      }
      {
    	  System.out.println();
      }
    	  for(int j=str.length()-1;j>=0;j--)
    	  {
    		  System.out.print(ch[j]+" ");
    	  }
    	  System.out.println();
      }
	}

