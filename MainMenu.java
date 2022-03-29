//package OrderSystem;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.IOException;

//test comment

class MainMenu
{
	static int ID;
	static String name;
	static double price;
	static String category;

	
	
	public static void main (String args[])throws IOException, InterruptedException
	{
		
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
		Item invoker = new Item();
		
		do{
		
			String formatDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
			
			System.out.println("###########################################################################");
			
			System.out.println("\t\t HAPPY EATING RESTAURANT \t\t" + formatDateTime);
			
			System.out.println("###########################################################################");
			
			System.out.println("Choose one!");
			
			System.out.println("\t \t <1>.Add Item");
			System.out.println("\t \t <2>.Show Item");
			System.out.println("\t \t <3>.Show array length");
			System.out.println("\t \t <4>.Exit");
			
			String choice = System.console().readLine("Your choice:");
			
			if(choice.equals("1")){
				
				
				
				ID = Integer.parseInt(System.console().readLine("Enter Item ID:"));
				
				name = System.console().readLine("Enter Item Name:");
				
				price = Double.parseDouble(System.console().readLine("Enter Item Price:"));
				
				category =System.console().readLine("Enter Item Category:");
				
				

				invoker.addItem(ID,name,price,category);	
				
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				
			}
			
			else if(choice.equals("2")){
			
			try{
				
				//System.out.println(invoker.getElementName(1) + " " + invoker.getElementID(1));
			}
			
			//catch(IndexOutOfBoundsException e){
			//	
			//	System.out.println("No record to show.Please add an item first.");
			//}
			
			catch(ArrayIndexOutOfBoundsException e){
				
				System.out.println("No such record to show.");
			}
			
				
				System.console().readLine("Press Enter to go back:");
				
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				
			}
			
			else if(choice.equals("3")){
				
				System.out.println(invoker.getObjSize());
				
			}
				
			else if(choice.equals("4")){
				break;
			}
		}
		
		while(true);
		
	}
	
}