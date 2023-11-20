package com.example.SpringBootProjectBank.Dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Setter
@Getter
public class UserDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private AddressDto userAddress;
	private AccountDto userAccount;
	private BranchDto userBranch;
}
