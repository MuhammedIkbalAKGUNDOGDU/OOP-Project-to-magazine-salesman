package nypDonemProjesi;

import java.io.Serializable;
import java.util.ArrayList;

public class Journal implements Serializable{
	private String name,issn;
	private int frequency;
	private double issuePrice;
	public ArrayList<Subscription> subscriptions = new ArrayList<>();
	 
	void addSubscription(Subscription subscription) {
		subscriptions.add(subscription);
	}

	public String getName() {
		return name;
	}

	public String getIssn() {
		return issn;
	}

	public int getFrequency() {
		return frequency;
	}

	public double getIssuePrice() {
		return issuePrice;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public void setIssuePrice(double issuePrice) {
		this.issuePrice = issuePrice;
	}

	@Override
	public String toString() {
		
		return  "Journal [name=" + name + ", issn=" + issn + ", frequency=" + frequency + ", issuePrice=" + issuePrice
				+ ", subscriptions="+ "]";
	}
	
	
}
