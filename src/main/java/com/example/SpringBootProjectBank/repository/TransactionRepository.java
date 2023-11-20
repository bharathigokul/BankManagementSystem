package com.example.SpringBootProjectBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootProjectBank.Dto.TransactionDto;

public interface TransactionRepository extends JpaRepository<TransactionDto, Integer>
{

}
