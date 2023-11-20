package com.example.SpringBootProjectBank.Dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Setter
@Getter
public class ManagerDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int managerId;
	private String managerName;
	private String managerPassword;
	@OneToOne(cascade = CascadeType.ALL)
	private AddressDto managerAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private BranchDto managerBranch;
}
