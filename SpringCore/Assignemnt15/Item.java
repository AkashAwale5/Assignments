package ass15;
//WAP in which three beans need to be created item, category and customer. Category 
//injected in item and item injected in customer. Now print all item purchased by customer.
public class Item
{
	String itemname;
	int itemid;
	int price;
	Category objcat;
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Category getObjcat() {
		return objcat;
	}
	public void setObjcat(Category objcat) {
		this.objcat = objcat;
	}
	
	public void showcat()
	{
		System.out.println("Category name : "+objcat.getCatname());
	}
	
}
