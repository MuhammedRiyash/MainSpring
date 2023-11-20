package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.FormEntity;

@Repository
public interface FormRepo extends JpaRepository<FormEntity,Integer>{

}
