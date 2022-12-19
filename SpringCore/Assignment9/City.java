package ass9;
//WAP to inject distance between different cities. Now user will input two cities name and on 
//the basis of the city name distance will be printed
public class City 
{
	String cityname;
	int distance;
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	void show()
	{
		System.out.println("city name- "+getCityname());
		System.out.println("distance- "+getDistance());
	}

}
