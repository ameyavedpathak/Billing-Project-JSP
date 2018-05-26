import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int status = 0;
		int i;
		int r = 0;
		int x =0;
		int sr = 1;
		int total = 1;
		double t;	
		String array[] = new String[10];
		int Total[] = new int[10];
		
	while(status==0)
	{		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the choice \n1. GOLD  \n2. Silver ");
		int a = scan.nextInt();
		
		System.out.println("Enter the itemname ");
		String name = scan.next();
		
		System.out.println("Enter the weight  ");
		int weight = scan.nextInt();
		
		System.out.println("Enter the quantity  ");
		int quantity = scan.nextInt();
		
		int totprice = calculate(weight,quantity,a);
		System.out.println("Total bill : "+ name + " - "+totprice);
		
		array[sr]= name +"   "+ totprice;
		Total[total]= +totprice;
		
		System.out.println("You want to continue shopping  \n1. Yes \n2. No");
		Scanner scan1 = new Scanner(System.in);
		int b = scan.nextInt();
		
		if(b==2)
		{
			status = 1;
		}
		else if(b==1)
		{		
			sr=sr+1;
			total=total+1;
		}		
		else
		{
			System.out.println("error");
		}
		
}//end of while
					
	System.out.println("\nFinal Bill:");
			for(i=1; i<=sr ;i++)
			{
			
				System.out.println(array[i]);
				
			}
			
			for(i=1; i<=total ;i++)
			{
			
			
				r = Total[i];
				x = x + r;
								
			}
			System.out.println("Total Cost is :"+x);
			
			System.out.println("Have a Nice Day");
		
	}//end of main
	
	public static int calculate(int weight, int quantity, int a)
	{
		int tot=0;
		
		if(a==1)
		{
			int rate = 3800;
			tot= weight*quantity*rate;			
		}
		else if(a==2)
		{
			int rate = 500;
			tot = weight*quantity*rate;
		}		
		else
		{
			System.out.println("Enter valid type");
		}    
		return tot;
	}	
	
		
}//class closing
