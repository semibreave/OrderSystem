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
	
	public int getID(int index)
	{
		return obj.get(index).id;
	}
	
	public String getName(int index)
	{
		return obj.get(index).name;
	}
	
	public double getPrice(int index)
	{
		return obj.get(index).price;
	}
	
	public String getCategory(int index)
	{
		return obj.get(index).category;
	}
	
	
	public int getObjSize(){
	
	   return obj.size();

	}
	
}
