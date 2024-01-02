package atm_program;
import java.util.Scanner;

public class Program {
	public static void main(String[] k)
	{
		int crdno=123456,pinno=3333,crdno1,pinno1,totlamt=10000,n;
		Scanner x=new Scanner(System.in);
		System.out.println("enter card no");
		crdno1=x.nextInt();
		System.out.println("enter pin no");
		pinno1=x.nextInt();
		if(crdno==crdno1&&pinno==pinno1)
		{
			System.out.printf("WELCOME THEJA\n1.Withdraw\n2.Deposit\n3.Balenquiry\n4.Mini statememt\n5.Exit\nEnter ur choice\n");
		    n=x.nextInt();
			if(n==1)
			{System.out.println("enter amount");
			int amt=x.nextInt();
			if(amt<=totlamt)
			{int actlamt=totlamt-amt;
			System.out.println("successfully withdrawen"+"\n"+"Do uwant to display balance?"+"\n"+"1.yes"+"\n"+"2.no");
			int m=x.nextInt();
			  if(m==1)
			   {
				System.out.println("balance="+actlamt);
				
			   }
			  else if(m==2)
			    {
				System.out.println("Thank u exiting");
			    }
			     else
			      {
				System.out.println("invalid choice");
			      }
			}
			
			else
			{
				System.out.println("insufficient balance");
			}
			
				
			
		    }
		else if(n==2)
		{
			System.out.println("enter amount");
			 int amt=x.nextInt();
			 int actlamt=totlamt+amt;
			 System.out.println("successfully deposited");
			 System.out.println("do u want to display balance?");
			 System.out.println("1.yes"+"\n"+"2.no");
			 int m=x.nextInt();
			 if(m==1)
			 {
				 System.out.println("Balance="+actlamt);
			 }
			 else if(m==2)
			 {
				 System.out.println("thank u exiting");
			 }
			 else
			 {
				 System.out.println("invalid opition");
			 }
			 
			 
			 
		}
		else if(n==3)
		{
			System.out.println("do u want to display balance"+"\n"+"1.yes"+"\n"+"2.n0");
			int m=x.nextInt();
			if(m==1)
			 {
				 System.out.println("Balance="+totlamt);
			 }
			 else if(m==2)
			 {
				 System.out.println("thank u exiting");
			 }
			 else
			 {
				 System.out.println("invalid opition");
			 }
		}
		else if(n==4)
		{
			System.out.printf("Date\tmode\tbalance\n18/9/23\tonline\t12000");
		}
		else if(n==5)
		{
			System.out.println("thank u exiting");
		}
		else
		{
			System.out.println("invalid input");
		}
			
	}
	}	
	

}
