package sample;

import java.util.Scanner;

public class Hourclock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		  { 
			       for(int i=1; i<=row; i++)
			    {
			          for(int k=1; k<=i-1; k++)
			        {
			              System.out.print(" ");
		       } 
			        for(int j=1; j<=row-i+1; j++)
		       {
			            System.out.print("* ");
			        } 
			         System.out.println();
			    }
			       for(int i=4; i>=1; i--)
			    	       {
			    	           for(int k=1; k<=i-1; k++)
			    	           {
			    	             System.out.print(" ");
			    	          } 
			    	          for(int j=i; j<=row; j++)
			    	           {
			    	              System.out.print("* ");
			    	         } 
			    	          System.out.println();  
		  } }}}
