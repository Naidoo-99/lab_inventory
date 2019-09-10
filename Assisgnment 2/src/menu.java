import java.util.Scanner;

public class menu {
	boolean exit;
	
	public static void main(String[]args) {
		menu menu=new menu();
		menu.runMenu();
		
	}
	
	public void runMenu() {
		while(!exit) {
			printmenu();
			int choice =getInput();
			action(choice);		}
	}
	
	
	
	
	private void printmenu() {
		
		System.out.println(" "+ "Welcome to Labinventory");
		System.out.println("Press enter to continue ");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		System.out.println(" "+ "1)Enter a new Item to the inventory (password required)");
		System.out.println(" "+ "2)Change information of an existing Item (password required)");
		System.out.println(" "+ "3)Display all the Items with the specified category");
		System.out.println(" "+ "4)Display all Items to be re-ordered");
		System.out.println(" "+ "5)Quit");
	}


private int getInput() {
	Scanner scanner=new Scanner(System.in);
	
	int choice= -1;
	while(choice <0 || choice>6) {
		try {
			System.out.print("\nPlease enter a choice>");
			choice = Integer.parseInt(scanner.nextLine());
			
		}catch(NumberFormatException e) {
			System.out.println("Invalid selection, Please try again");
		}
		
		
	}
	return choice;
}




private void action(int choice){
	switch(choice) {
	
		
	case 1:
		do {
			Scanner input = new Scanner(System.in);
			
			String pass;
			
			System.out.println("Password Required");
			pass= input.nextLine();
			
			if(pass.equals("DitProg123")) {
			
				System.out.println("Welcome");
				
				
				
				break;
				
				
				}
			
				
				else {
			
				
					System.out.println("wrong password");
					System.out.println("Please try again");
					
				}
			}while(false);
					break;
		
		
		


			
		



		

		
	case 2:
		do {
			Scanner input = new Scanner(System.in);
			
			String pass;
			
			System.out.println("enter your password");
			pass= input.nextLine();
			
			if(pass.equals("DitProg123")) {
			
				System.out.println("welcome");
				System.out.println();
				System.out.println("Do you want to update the itemdatabase?"); 
				
				
				
			}else {
				
				
					System.out.println("wrong password");
					System.out.println("Please try again");
					break;
				}
			}while(false);
		
		
		
		System.out.println("What information do you want to change?");
		
		System.out.println("      1. Name");
		System.out.println("      2. Description");
		System.out.println("      3. Category");
		System.out.println("      4. Supplier name");
		System.out.println("      5. Supplier contacts");
		System.out.println("      6. Price");
		System.out.println("      7. Available qty");
		System.out.println("      8. Quit");
		
		break;
	case 3:
		
		
		
	case 4:
		
		
		
		
	case 5:
		exit = true;
		System.out.println("thank you for using the application");
		break;
		
		
	
		default:
			System.out.println("an unknown error as occured");
		
	}
}





	
		
	}
	
	
	
	