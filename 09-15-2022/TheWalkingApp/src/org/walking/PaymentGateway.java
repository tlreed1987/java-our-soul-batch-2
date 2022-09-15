package org.walking;

public class PaymentGateway {
	private static final PaymentGateway pg=new PaymentGateway();
	private String cardNo;
	private double amount;
	private String cardType;
	private PaymentGateway() {
		
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public static PaymentGateway getInstance() {
		return pg;
	}
	

}
