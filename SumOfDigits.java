import java.util.Scanner;
class SumOfDigits
	{
		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a Number:");
				int no=sc.nextInt();
				int number,sum=0;
				while(no!=0)
					{
						number=no%10;
						sum=sum+number;
						no=no/10;	
					}
				System.out.println("The Sum of Digits :"+sum);

			}
	}