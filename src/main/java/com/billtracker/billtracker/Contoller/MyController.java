package com.billtracker.billtracker.Contoller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.billtracker.billtracker.entities.Bill;
import com.billtracker.billtracker.expenses.BillExpenses;

@RestController
public class MyController {
 @Autowired
 private BillExpenses billExpenses;
	
	
	@GetMapping("/home")
	public String home() {
	  return "Welcome to Bills Application" ;
	}
	
	// get the bills
	@GetMapping("/Bills")
	public List<Bill> getBills()
	{
		return this.billExpenses.getBills();
	}
	
	// get single Bill
		@GetMapping("/Bills/{BillId}")
		public Bill getBill(@PathVariable String BillId)
		{
			return this.billExpenses.getBill(Long.parseLong(BillId));
		}
	
	
		
		// adding Bill 
		@PostMapping("/Bills")
		public Bill addBill(@RequestBody Bill bill)
		{
			return this.billExpenses.addBill(bill);
		}
		
		//updating Bills
		@PutMapping("/Bills")
		public Bill updateBill(@RequestBody Bill bill)
		{
			return this.billExpenses.updateBill(bill);
		}
		
		
		// delete the Bill
		@DeleteMapping("/Bills/{BillId}")
		public ResponseEntity<HttpStatus> deleteBill(@PathVariable String BillId)
		{
			try 
			{
				this.billExpenses.deleteBill(Long.parseLong(BillId));
				return new ResponseEntity<>(HttpStatus.OK);
			}
			catch(Exception e)
			{
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}	
		
		
}
