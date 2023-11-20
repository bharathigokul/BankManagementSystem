package com.example.SpringBootProjectBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootProjectBank.Dto.AddressDto;

public interface AddressRepository extends JpaRepository<AddressDto, Integer>
{

}
