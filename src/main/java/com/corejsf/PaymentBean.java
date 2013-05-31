package com.corejsf;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("payment")
@SessionScoped
public class PaymentBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private double amount;
	private String card = "";
	private Date date = new Date();
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
