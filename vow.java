package prac;

import java.util.Scanner;

public class vow //ojdbc8,7,6,5,4,3
{ void meth1()
	{
	System.out.println("hiii");
	}
	static Scanner d=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your name ");
		String name=d.nextLine();
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		StringBuffer sb3=new StringBuffer();
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			int k=(int)ch;
			
			switch(ch)
			{
			case 'a':
			case 'A':
			case 'i':
			case 'I':
			case 'e':
			case 'E':
			case 'O':
			case 'o':
			case'u':
			case 'U':
				sb1.append(ch+" ");break;
				default:
					sb2.append(ch+" ");
			}
			if(k>=48 && k<=57)
			{
				sb3.append(ch+" ");
			}
	
		}System.out.println("vowels:"+sb1);
		System.out.println("consonants:"+sb2);
System.out.println("numbers:"+sb3);
	}
}
