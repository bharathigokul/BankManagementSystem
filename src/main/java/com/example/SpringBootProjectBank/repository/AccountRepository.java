package com.example.SpringBootProjectBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootProjectBank.Dto.AccountDto;

public interface AccountRepository extends JpaRepository<AccountDto, Integer>
{

}
