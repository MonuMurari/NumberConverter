package com.specialnumberconvert;

import java.util.Scanner;

public class NumberConverter 
{
	
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try
        {
        	loop:
        	while(true)
        	{
	        	System.out.println("1.Decimal to Binary");
	        	System.out.println("2.Binary to Decimal");
	        	System.out.println("3.Decimal to Octal");
	        	System.out.println("4.Octal to Decimal");
	        	System.out.println("5.Decimal to Hexadecimal");
	        	System.out.println("6.Hexadeciaml to Decimal");
	        	System.out.println("0.Exit!");
	        	System.out.println("Enter conversion to do? ");
	        	
	        	int ch=sc.nextInt();
	        	
	        	int no=0;
	        	
	        	if(ch==1 || ch==3 || ch==5)
	        	{
	        		System.out.println("Enter  decimal number : ");
			        no=sc.nextInt();
	        	}
	        	
	        	switch(ch)
	        	{
		        	
		        	case 0:
		        		break loop;
		        	case 1:
		        			System.out.println("Binary of Number is : "+Integer.toBinaryString(no));
		        			break;
		        	case 2:
				        	System.out.println("Enter Binary number : ");
				        	String bno=sc.next();
				        	System.out.println("Decimal number : "+Integer.parseInt(bno, 2));
				        	break;
		        	case 3:
			        		System.out.println("Octal of Number is : "+Integer.toOctalString(no));
			        		break;
		        	case 4:
			        		System.out.println("Enter Octal number : ");
				        	String oct=sc.next();
				        	System.out.println("Decimal number : "+Integer.parseInt(oct, 8));
				        	break;
		        	case 5:
		        			System.out.println("Hexadecimal of Number is : "+Integer.toHexString(no));
	    					break;
		        	case 6:
			        		System.out.println("Enter Hexadecimal number : ");
				        	String hex=sc.next();
				        	System.out.println("Decimal number : "+Integer.parseInt(hex, 16));
				        	break;
				    default:
				    		System.out.println("Invalid choice!!!Re-enter");
	        	}
        	}
        }
        catch(NumberFormatException ex)
        {
        	System.out.println("Invaid Number!!!"+ex);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        finally
        {
        	sc.close();
        }
    }
}
