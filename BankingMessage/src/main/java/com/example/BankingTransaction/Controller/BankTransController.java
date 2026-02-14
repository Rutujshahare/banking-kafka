package com.example.BankingTransaction.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankingTransaction.DTO.Bank;
import com.example.BankingTransaction.Service.BankingTransService;

@RestController
@RequestMapping("/Bank")
public class BankTransController {

	@Autowired
	private BankingTransService bankingTransService;
	
	@GetMapping("/getTransaction")
	public ResponseEntity<String> addTransactionMessage(){
		String responseString=this.bankingTransService.getMessageString();
		return new ResponseEntity<String>(responseString,HttpStatus.OK);
	}
}
