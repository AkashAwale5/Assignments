package ass13;

public class Collection 
{
	String moviename;
	String showtime;
	int priceofticket;
	String businessincrore;
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getShowtime() {
		return showtime;
	}
	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
	public int getPriceofticket() {
		return priceofticket;
	}
	public void setPriceofticket(int priceofticket) {
		this.priceofticket = priceofticket;
	}
	public String getBusinessincrore() {
		return businessincrore;
	}
	public void setBusinessincrore(String businessincrore) {
		this.businessincrore = businessincrore;
	}
	
	public void show() {
		System.out.println("movie name = "+moviename);
		System.out.println("show time = "+showtime);
		System.out.println("Price of ticket = "+priceofticket);
		System.out.println("Total Collection = "+businessincrore);
		
	} 
}
