package com.example.SpringBootProjectBank.Dto;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Setter
@Getter
public class BranchDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchId;
	private String bankIFSC;
	private ManagerDto manager;
	@ManyToOne
	private BankDto bank;
	@OneToOne
	private ManagerDto branchManager;
	@OneToMany
	private List<UserDto> user;
	@OneToOne(cascade = CascadeType.ALL)
	private AddressDto branchAddress;
}
