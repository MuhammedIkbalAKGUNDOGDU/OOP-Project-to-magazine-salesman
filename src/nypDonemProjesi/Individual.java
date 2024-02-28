package nypDonemProjesi;

import java.io.Serializable;

public class Individual extends Subscriber{
	public Individual(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	private String creditCardNr;
	private int expireMonth,expireYear,CCV;
	
	@Override
	public String getBillingInformation() {
		// TODO Auto-generated method stub
		
		return creditCardNr+String.valueOf(expireMonth)+String.valueOf(expireYear)+String.valueOf(CCV);
	}

	@Override
	public String toString() {
		return "Individual [creditCardNr=" + creditCardNr + ", expireMonth=" + expireMonth + ", expireYear="
				+ expireYear + ", CCV=" + CCV + "]";
	}

	public String getCreditCardNr() {
		return creditCardNr;
	}

	public void setCreditCardNr(String creditCardNr) {
		this.creditCardNr = creditCardNr;
	}

	public int getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(int expireMonth) {
		this.expireMonth = expireMonth;
	}

	public int getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(int expireYear) {
		this.expireYear = expireYear;
	}

	public int getCCV() {
		return CCV;
	}

	public void setCCV(int cCV) {
		CCV = cCV;
	}
	
	
}
