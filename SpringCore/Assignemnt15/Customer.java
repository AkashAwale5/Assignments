package ass15;

public class Customer 
{
	String custname;
	String mobno;
	String address;
	Item objitem;
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Item getObjitem() {
		return objitem;
	}
	public void setObjitem(Item objitem) {
		this.objitem = objitem;
	}
	
	public void show_customer()
	{
		System.out.println("Customer Name: "+getCustname());
		System.out.println("Customer Address: "+getAddress());
		System.out.println("Customer mob no: "+getMobno());
		System.out.println("Item name : "+objitem.itemid);
		System.out.println("Item id : "+objitem.itemname);
		System.out.println("Item Price : "+objitem.price);
		objitem.showcat();
		System.out.println();
	}
	
}
