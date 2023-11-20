package com.example.SpringBootProjectBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootProjectBank.Dto.BankDto;

public interface BankRepository extends JpaRepository<BankDto, Integer>
{

}
