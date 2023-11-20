package com.example.SpringBootProjectBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootProjectBank.Dto.UserDto;

public interface UserRepository extends JpaRepository<UserDto, Integer>
{

}
