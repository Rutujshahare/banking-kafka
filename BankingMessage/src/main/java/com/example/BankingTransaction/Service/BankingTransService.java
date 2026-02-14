package com.example.BankingTransaction.Service;

import java.security.PublicKey;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.BankingTransaction.DTO.Bank;
import com.example.BankingTransaction.constant.AppConstant;

@Service
public class BankingTransService {

	public String messageString = "";

	@KafkaListener(topics = AppConstant.TOPIC_NAME, groupId = AppConstant.GROUP_NAME)
	public void UpdateMessage(Bank bank) {
		messageString=bank+"the data has been recieved by banking transaction";
		System.out.println(messageString);
	}

	public String getMessageString() {
		return messageString;
	}

	public void setMessageString(String messageString) {
		this.messageString = messageString;
	}
	

}
