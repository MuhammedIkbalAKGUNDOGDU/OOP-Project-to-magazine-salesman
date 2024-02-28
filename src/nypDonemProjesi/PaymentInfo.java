package nypDonemProjesi;

import java.io.Serializable;

public class PaymentInfo implements Serializable{
	final double discountRate = 0;
	private double receviedPaymnent = 0;
	
    public double getReceviedPaymnent() {
		return receviedPaymnent;
	}
	 
    public void increasePaymnent(double amount) {
		this.receviedPaymnent = getReceviedPaymnent()+amount;
	}

	@Override
	public String toString() {
		return "PaymentInfo [discountRate=" + discountRate + ", receviedPaymnent=" + receviedPaymnent + "]";
	}
    
}
