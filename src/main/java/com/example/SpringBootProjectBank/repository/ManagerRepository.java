package com.example.SpringBootProjectBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootProjectBank.Dto.ManagerDto;

public interface ManagerRepository extends JpaRepository<ManagerDto, Integer>
{

}
