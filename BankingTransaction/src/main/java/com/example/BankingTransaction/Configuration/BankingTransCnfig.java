package com.example.BankingTransaction.Configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.example.BankingTransaction.constant.AppConstant;

@Configuration
public class BankingTransCnfig {
public NewTopic topic() {
	return TopicBuilder.name(AppConstant.TOPIC_NAME).build();
}
}
