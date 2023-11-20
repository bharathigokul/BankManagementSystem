package com.example.SpringBootProjectBank.Dto;

import java.util.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Setter
@Getter
public class TransactionDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionId;
	private double transactionAmount;
	private long transactionToAccount;         // AccountNumber  
	private Date transactionDateAndTime;        // Date--->java.util package
    private TransactionTypeDto transactionType;
    private TransactionStatus transactionStatus;

}
