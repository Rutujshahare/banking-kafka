package com.example.BankingTransaction.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.BankingTransaction.DTO.Bank;
import com.example.BankingTransaction.constant.AppConstant;

@Service
public class BankingTransService {
	@Autowired
private KafkaTemplate<String, Bank> kafkaTemplate;
	public String updateTransaction(Bank bank) {
		this.kafkaTemplate.send(AppConstant.TOPIC_NAME,bank);
		String messageString="";
		if(bank.getChoice().equalsIgnoreCase("deposit")) {
			messageString="the amount is deposited and message has been sent ";
		}
		else {
			messageString="the amount is withdrawl and message has been sent -(withdrawl)";
		}
		return messageString;
	}
}
