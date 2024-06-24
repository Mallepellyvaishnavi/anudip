package anudip;

import java.util.Scanner;

public class StringReverse {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);//using the   input scanner
		System.out.println("enter a string:");
		String str=scanner.nextLine();

		char ch[] = str.toCharArray(); // strings into arrays
      for(int i=0;i<str.length();i++) //logic intiliazation for loop
      {
    	  System.out.print(ch[i]);
      }
      {
    	  System.out.println();
      }
    	  for(int j=str.length()-1;j>=0;j--)
    	  {
    		  System.out.print(ch[j]+" "); //printing the reverse string 
    	  }
    	  System.out.println();
      }
	}

