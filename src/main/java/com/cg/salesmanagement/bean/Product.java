package com.cg.salesmanagement.bean;

public class Product {
	private String salesId;
	private int productCode;
	private int quantity;
	private String salesDate;
	private int lineTotal;
	
	public Product(String salesId,int productCode,int quantity,String salesDate,int lineTotal) {
		
		this.salesId=salesId;
		this.productCode=productCode;
		this.salesDate=salesDate;
		this.quantity=quantity;
		this.lineTotal=lineTotal;
		
	}
	
	public Product() {
		
	}

	public String getSalesId() {
		return salesId;
	}
	public void setSalesId(String salesId) {
		this.salesId = salesId;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(String salesDate) {
		this.salesDate = salesDate;
	}
	public int getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(int lineTotal) {
		this.lineTotal = lineTotal;
	}

	public boolean getcode() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
