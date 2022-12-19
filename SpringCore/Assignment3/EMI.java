package ass3;
//WAP to print No of EMI for a given amount of loan for a given number of years or month. 
//You have to fetch the interest rate from the xml file and loam amount and rate of interest is 
//entered by you
public class EMI 
{
	int loanamount;
	int years;
	double rate;
	public int getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(int loanamount) {
		this.loanamount = loanamount;
	}
	
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public void emiCalculator()//npr
	{
		double total= getLoanamount() * getRate()/100 * getYears();
		
		
		double totalamount= loanamount + total;
		double emi=totalamount/(getYears()*12);
		int totalemi=getYears()*12;
		System.out.println("Amount per Emi:- "+emi);
		System.out.println("Total no of EMI:- "+totalemi);
	}
	
}
