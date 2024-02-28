package nypDonemProjesi;

import java.io.Serializable;

public abstract class Subscriber implements Serializable{
	 private String name,address;
	 
	 public Subscriber(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	 
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public abstract String getBillingInformation(); 
}
