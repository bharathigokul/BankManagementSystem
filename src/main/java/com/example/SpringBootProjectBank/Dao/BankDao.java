package com.example.SpringBootProjectBank.Dao;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SpringBootProjectBank.Dto.BankDto;
import com.example.SpringBootProjectBank.repository.BankRepository;

@Repository
public class BankDao {

	@Autowired
	BankRepository bankRepo;
	
	public BankDto saveBank(BankDto dto)
	{
	    return bankRepo.save(dto);
	}
	public BankDto findBank(int id)
	{
		Optional<BankDto> op = bankRepo.findById(id);
		 if(op.isPresent())
		 {
			 return  op.get();
		 }
		 return null;
	}
	public BankDto deleteBank(int id)
	{
	     BankDto bank =   findBank(id);
	     if(bank!=null)
	     {
	    	  bankRepo.delete(bank);
	    	  return bank;
	     }
	     return null ;
	}
	public BankDto updateBank(BankDto dto , int id)
	{
		
	}
}
