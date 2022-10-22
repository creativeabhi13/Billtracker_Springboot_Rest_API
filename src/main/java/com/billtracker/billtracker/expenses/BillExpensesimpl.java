package com.billtracker.billtracker.expenses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billtracker.billtracker.dao.BillDao;
import com.billtracker.billtracker.entities.Bill;
@Service
public class BillExpensesimpl implements BillExpenses {

	@Autowired
	private BillDao billDao;
	
	
	
	
	
	@Override
	public List<Bill> getBills() {
		return billDao.findAll();
	}

	@Override
	public Bill getBill(long BillId) {
		
		
		return billDao.getOne(BillId);
	}

	@Override
	public Bill addBill(Bill bill) {
		
		billDao.save(bill);
		return bill;
		
	}

	@Override
	public Bill updateBill(Bill bill) {
		
		
		billDao.save(bill);
		return bill;
	}

	@Override
	public void deleteBill(long parseLong) {
	
		
	Bill entity =	billDao.getOne(parseLong);
	billDao.delete(entity);
	}

}
