package com.example.SpringBootProjectBank.Dto;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Setter
@Getter
public class BankDto {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankId;
	private String bankName;
	private long bankContact;
	@OneToMany(cascade = CascadeType.ALL)
	private List<BranchDto> bankBranch;
}
