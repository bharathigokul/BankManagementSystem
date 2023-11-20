package com.example.SpringBootProjectBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootProjectBank.Dto.BranchDto;

public interface BranchRepository extends JpaRepository<BranchDto, Integer>
{

}
