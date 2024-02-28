package nypDonemProjesi;

import java.io.Serializable;

public class DateInfo implements Serializable{
	int starthMonth,endMonth,startYear;

	public DateInfo(int starthMonth, int endMonth, int startYear) {
		super();
		this.starthMonth = starthMonth;
		this.endMonth = endMonth;
		this.startYear = startYear;
	}

	@Override
	public String toString() {
		return "DateInfo [starthMonth=" + starthMonth + ", endMonth=" + endMonth + ", startYear=" + startYear + "]";
	}
	
	public DateInfo copy() {
	    return new DateInfo(this.starthMonth, this.endMonth, this.startYear);
	}

}
