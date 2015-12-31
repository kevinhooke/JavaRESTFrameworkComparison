package kh.simplespringbootjersey.domain;

import java.util.Date;


public class SimpleResult {

	private Date date = new Date();

	public SimpleResult(){
		
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
