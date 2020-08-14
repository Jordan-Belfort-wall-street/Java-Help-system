// A simple Java Help system

class Help {
	
	public static void main(String args[]) 
		throws java.io.IOException{
			
		char choice, ignore;
		
		do {
			System.out.println("Help System:");
			System.out.println("  1. if");
			System.out.println("  2. switch");
			System.out.println("  3. for");
			System.out.println("  4. while");
			System.out.println("  5. do while\n");
			System.out.print("Select a number: ");
			choice = (char) System.in.read();
			System.out.println();
			
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
			
		}while (choice < '1' | choice > '5');
		
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
		}	
		
	}
}