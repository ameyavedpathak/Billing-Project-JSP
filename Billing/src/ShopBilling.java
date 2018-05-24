import java.text.DecimalFormat;
import java.util.Scanner;
public class ShopBilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the choice \n1. GOLD  \n2. Silver ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); 		// Choice Scanner
		
		if(a==1)
		{
			System.out.println("Please enter the weight = ");
			double x1 = scan.nextDouble();
			System.out.println("Do you have anything to exchange 1. Yes  2. NO : ");
			Scanner scan1 = new Scanner(System.in);
			int b = scan.nextInt();
			
				if(b==1)
				{
					System.out.println("Please enter the amount : ");
					Scanner scan2 = new Scanner(System.in);
					double x2 = scan.nextDouble();
					double T = 3800;
					double LC = 40;   //Labour Charges
					double G = x1*T+LC-x2;
					
					DecimalFormat dtime = new DecimalFormat("#.#"); 
					G= Double.valueOf(dtime.format(G));
									
					System.out.println("Current Rate of Gold is  "+T);
					System.out.println("Labour Charges are : " +LC);
					System.out.println("Mortagage amount is : " +x2);
					System.out.println("Total Cost :  "+G);					
					
				}else
				{
					double T = 3800;
					double LC = 40;   //Labour Charges
					double G = x1*T+LC;	
					System.out.println("Current Rate of Gold is  "+T);
					System.out.println("Labour Charges are : " +LC);
					System.out.println("Total Cost :  "+G);
									
				}
					
					
					
		}
		if(a==2)
		{
			System.out.println("Please enter the weight = ");
			double x1 = scan.nextDouble();
			double T = 450;
			double LC = 40;   //Labour Charges
			double G = x1*T+LC;	
			System.out.println("Current Rate of Silver is  "+T);
			System.out.println("Labour Charges are : " +LC);
			System.out.println("Total Cost :  "+G);
					
		}
			else
		{
			
			System.out.println("  ");
		}
		
		
	}

}
