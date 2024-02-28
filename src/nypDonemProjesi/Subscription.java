package nypDonemProjesi;

import java.io.Serializable;

public class Subscription implements Serializable {
	
	private int copies ;
	private PaymentInfo payment;
	final DateInfo dates;
	final Subscriber subscriber;
	final Journal journal;
	
	public Subscription(int copies,DateInfo dates, Subscriber subscriber,Journal journal){
		this.dates= dates;
		this.copies = copies;
		this.subscriber = subscriber;
		this.journal = journal;
		this.payment = new PaymentInfo();
	}

	@Override
	public String toString() {
		return "Subscription [copies=" + copies + ", payment=" + payment + ", dates=" + dates + ", subscriber="
				+ subscriber + ", journal=" + journal + "]";
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	
	public double getPayment() {
		return payment.getReceviedPaymnent();
	}

	void acceptPayment(double amount) {
		this.payment.increasePaymnent(amount);
	}
	
	boolean canSend(int issueMonth) {
		int time = issueMonth/journal.getFrequency();
		if(payment.getReceviedPaymnent()>=time*journal.getIssuePrice()){
			return true;
		}else {
			return false;
		}
	}
	
}
