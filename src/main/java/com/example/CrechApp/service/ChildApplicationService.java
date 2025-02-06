package com.example.CrechApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CrechApp.model.ChildApplication;
import com.example.CrechApp.repository.ChildApplicationRepository;

@Service
public class ChildApplicationService 
{
    //remeber the repo has build in methods that deals with the database directly
    private final ChildApplicationRepository childApplicationRepository;

    @Autowired
    public ChildApplicationService(ChildApplicationRepository childApplicationRepository) 
    {
        this.childApplicationRepository = childApplicationRepository;
    }

    // Create, Update, Delete, Remove

    //create a child application
    public ChildApplication saveChildApplication(ChildApplication childApplication)
    {
        return childApplicationRepository.save(childApplication);
    }


    //get all child applications
    public List<ChildApplication> getAllApplications()
    {
        return childApplicationRepository.findAll();
    }

    //delete childapplication
    public void deleteApplication(Long id)
    {
        childApplicationRepository.deleteById(id);
    }

    
}

   
