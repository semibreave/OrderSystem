//package OrderSystem;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.IOException;


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
			System.out.println("\t \t <3>.Exit");
			
			String choice = System.console().readLine("Your choice:");
			
			if(choice.equals("1")){
				
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				
				try{
					
					ID = Integer.parseInt(System.console().readLine("Enter Item ID:"));
				
					name = System.console().readLine("Enter Item Name:");
					
					price = Double.parseDouble(System.console().readLine("Enter Item Price:"));
					
					category =System.console().readLine("Enter Item Category:");
					
					invoker.addItem(ID,name,price,category);
				}
				
				catch(NumberFormatException e){
					
					System.out.println("Only numbers allowed");
					
					System.console().readLine("Press Enter to go back to main menu:");
				}
				
				
				
				
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				
			}
			
			else if(choice.equals("2")){
				
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				
				if(invoker.getObjSize() != 0){
				
					System.out.println("Total Items:" + invoker.getObjSize());
					
					for(int i = 0; i < invoker.getObjSize();i++)
					
					System.out.println("ID:"+invoker.getID(i)+"\t"+ "Item:" + invoker.getName(i)+ "\t" + "Price:" + invoker.getPrice(i)+"\t"+"Category:" + invoker.getCategory(i));		
					
				}
				
				else{
					
					System.out.println("No record to show.Please add an item first.");
					
					
				}
				
				System.console().readLine("Press Enter to go back:");
				
			
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				
			}
			
			else if(choice.equals("3")){
				break;
			}
		}
		
		while(true);
		
	}
	
}