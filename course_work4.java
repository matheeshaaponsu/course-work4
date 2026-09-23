import java.util.Scanner;
class course_work4{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("|        Salary Information System         |");
		System.out.println("--------------------------------------------");
		System.out.println("  [1] Calculate Income Tax");
		System.out.println("  [2] Calculate Annual Bonus");
		System.out.println("  [3] Calculate Loan Amount\n");

		System.out.print("Enter An option to Continue >");
		int num=input.nextInt();
		
		String name = "A";
		double salary = 0;
		double tax=0; 
		switch(num){
			
			case 1:					
				System.out.println("--------------------------------------------");
				System.out.println("|           Calculate Income Tax           |");
				System.out.println("--------------------------------------------");
				input.nextLine();
				System.out.print("Input Employee Name	- ");
				name=input.nextLine();
				System.out.print("Input Employe salary	- ");
				salary=input.nextDouble();
				
				if(salary<=100000){
					System.out.println("You have to pay Income Tax per month: "+0.00);
				}else if(salary<141667){
					System.out.println("You have to pay Income Tax per month: "+(salary-100000)*0.06);
				}else if(salary<183333){
					System.out.println("You have to pay Income Tax per month: "+(2500+(salary-141667)*0.12));
				}else if(salary<225000){
					System.out.println("You have to pay Income Tax per month: "+(2500+5000+(salary-183333))*0.18);
				}else if(salary<266667){
					System.out.println("You have to pay Income Tax per month: "+(2500+5000+7500+(salary-225000))*0.24);
				}else if(salary<308333){
					System.out.println("You have to pay Income Tax per month: "+(2500+5000+7500+10000+(salary-266667))*0.30);
				}else if(salary>308333){
					System.out.println("You have to pay Income Tax per month: "+(2500+5000+7500+1000+(salary-308333))*0.36);
				}
			break;

			case 2:		
				System.out.println("--------------------------------------------");
				System.out.println("|           Calculate Annual Bonus         |");
				System.out.println("--------------------------------------------");
				input.nextLine();
				System.out.print("Input Employee Name	- ");
				name=input.nextLine();

				System.out.print("Input Employe salary	- ");
				salary=input.nextDouble();

				if(salary<100000){
					System.out.println("\nAnnual bonus - "+5000);
				}else if(salary<200000){
					System.out.println("\nAnnual bonus - "+salary*0.10);
				}else if(salary<300000){
					System.out.println("\nAnnual bonus - "+salary*0.15);
				}else if(salary<400000){
					System.out.println("\nAnnual bonus - "+salary*0.20);
				}else if(salary>400000){
					System.out.println("\nAnnual bonus - "+salary*0.35);
				} 	
			break;

			case 3:
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("|                        Calculate Loan amount                           |");
					System.out.println("--------------------------------------------------------------------------\n");
					
					input.nextLine();
					System.out.print("Input Employee name    -  ");
					name=input.nextLine();
					System.out.print("\nInput Employee salary  -  ");
					salary=input.nextDouble();
					input.nextLine();
					
					
					int year;

					
					if (salary>50000)
					{
						
						System.out.print("Enter number of year : ");
						year=input.nextInt();
						input.nextLine();
						
						if(year<=5)
						{
							int n=year*12;       //month=year*12
							double r=0.15;       //anual interest rate 15%
							
							double loanAmount=(salary*0.6)*(1-(1/Math.pow(1+(r/12),n)))/(r/12);                   //max monthly installment=salary*0.6;
							
							long round_loanAmount=Math.round(loanAmount/1000.0)*1000;
							
							System.out.println("You can get Loan Amount : "+round_loanAmount);
							
							
						}
						else
						{
							
							System.out.println("Invalid input! The maximum number of years is 5");
						}
						
						
						}
					
					else
					{
						System.out.println("You can not get a loan because your salary lessthan Rs.50 000...");
					}break;
					
			default:
					System.out.println("Wrong number");
		}
	}
}

