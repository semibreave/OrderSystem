//package OrderSystem;
import java.util.ArrayList;

public class Item
{
	int id;
	String name;
	double price;
	String category;
	
	ArrayList<Item> obj = new ArrayList<Item>();
	
	public Item()
	{
		
	}
	
	Item(int id,String name,double price,String category)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public void addItem(int id,String name,double price,String category)
	{
		obj.add(new Item(id,name,price,category));
	}
	
	public String getElementName(int index)
	{
		return obj.get(index).name;
	}
	
	
	public int getObjSize(){
	
	   return obj.size();

	}
	
	public static void main(String args[])
	{
		
		Item dummy = new Item();
	
		dummy.addItem(1421,"Burger",15.5,"Main");
		dummy.addItem(1126,"Shashimi",18.1,"Appetizer");
		dummy.addItem(1421,"Pizza",18.4,"Main");
		System.out.println(dummy.getElementName(1));
		//System.out.println(dummy.getName(1));
	}
	
}
