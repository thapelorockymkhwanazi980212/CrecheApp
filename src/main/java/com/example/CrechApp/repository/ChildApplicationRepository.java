package com.example.CrechApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CrechApp.model.ChildApplication;

@Repository
public  interface  ChildApplicationRepository extends JpaRepository<ChildApplication, Long>
{
    // spring data handles the implementation
}
