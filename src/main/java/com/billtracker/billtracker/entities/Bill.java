package com.billtracker.billtracker.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {

	@Id
	private long id;
	private String Name;
	private long bill;
	private String invoice;
	public Bill(long id, String name, long bill, String invoice) {
		super();
		this.id = id;
		Name = name;
		this.bill = bill;
		this.invoice = invoice;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getBill() {
		return bill;
	}
	public void setBill(long bill) {
		this.bill = bill;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	@Override
	public String toString() {
		return "Bill [id=" + id + ", Name=" + Name + ", bill=" + bill + ", invoice=" + invoice + "]";
	}
	
	
	
	
}
