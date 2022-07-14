class DeepTechPrint
	{
		public static void main(String[] args)
			{
				System.out.println("Enter the Number from 1 to 100 is :");
				for(int i=1;i<=100;i++)
					{

						if(i%20==0)
							{
								System.out.println("DeepTech");
							}
					
						else if(i%5==0)
							{
								System.out.println("Deep");
							}
						else if(i%8==0)
							{
								System.out.println("Tech");		
							}
						else
							{
								System.out.println(+i);
							}
						
					}
			}
	}