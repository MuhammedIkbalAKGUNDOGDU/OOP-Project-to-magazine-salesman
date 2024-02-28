package nypDonemProjesi;

import java.io.Serializable;

class Corporation extends Subscriber{
	private int bankCode,accountNumber,issueDay,issueMonth,issueYear;
	private String bankName;
	public Corporation(String name, String address,String bankName,int bankCode,int accountNumber,int issueDay,int issueMonth,int issueYear) {
		super(name, address);
		// TODO Auto-generated constructor stub
		this.bankCode=bankCode;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.issueDay=issueDay;
		this.issueMonth=issueMonth;
		this.issueYear=issueYear;
	}

	@Override
	public String toString() {
		return "Corporation [bankCode=" + bankCode + ", accountNumber=" + accountNumber + ", issueDay=" + issueDay
				+ ", issueMonth=" + issueMonth + ", issueYear=" + issueYear + ", bankName=" + bankName + "]";
	}
 
	@Override
	public String getBillingInformation() {
		return String.valueOf(bankCode)+bankName+String.valueOf(accountNumber)+String.valueOf(issueDay)+String.valueOf(issueMonth)+String.valueOf(issueYear);
	}

}
