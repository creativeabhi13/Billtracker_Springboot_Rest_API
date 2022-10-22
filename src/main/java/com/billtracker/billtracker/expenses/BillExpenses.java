package com.billtracker.billtracker.expenses;

import java.util.List;

import com.billtracker.billtracker.entities.Bill;

public interface BillExpenses {

	public List<Bill> getBills();
	
	public Bill getBill(long BillId );
	
	public Bill addBill(Bill bill);
	
	public Bill updateBill(Bill bill);
	
	public void deleteBill(long parseLong);
	
	
	
}
