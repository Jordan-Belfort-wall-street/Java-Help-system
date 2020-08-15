// A simple Java Help system

class Help {
	
	public static void main(String args[]) 
		throws java.io.IOException{
		
		for (;;) {
			
			char choice, ignore;
		
			do {
				System.out.println("\nHelp System:");
				System.out.println("  1. if");
				System.out.println("  2. switch");
				System.out.println("  3. for");
				System.out.println("  4. while");
				System.out.println("  5. do-while");
				System.out.println("  6. break");
				System.out.println("  7. continue\n");
				System.out.print("choose one (q to quit): ");
				
				choice = (char) System.in.read();
				System.out.println();
				
				do {
					ignore = (char) System.in.read();
				} while (ignore != '\n'); // this is because console is line buffer
				
			}while (choice < '1' | choice > '7' & choice != 'q');
			
			if (choice == 'q') break;
			System.out.println();
			
			switch (choice) {
				case '1':
					System.out.println("The if:\n");
					System.out.println("if (condition) {statement}\nelse if (condition) {statement}\nelse {statement}");
					break;
					
				case '2':
					System.out.println("The switch:\n");
					System.out.println("switch (expression) {");
					System.out.println("  case constant:\n    statement sequence;\n    break;\n}");
					break;
					
				case '3':
					System.out.println("for loop:\n");
					System.out.println("for (initialization; condition; iteration) {\n  statement \n}");
					break;
					
				case '4':
					System.out.println("while loop:\n");
					System.out.println("while (condition) {\n statement \n}");
					break;
				
				case '5':
					System.out.println("do while loop:\n");
					System.out.println("do {\n statement \n} while(condition)");
					break;
					
				case '6':
					System.out.println("The break:\n");
					System.out.println("break; or break label;");
					break;
				
				case '7':
					System.out.println("The continue:\n");
					System.out.println("continue or continue label;");
					break;
			}
			System.out.println();
		}
	}
}