package com.mypersonal.jobexercises.Services.serviceimpl;


import com.mypersonal.jobexercises.Exceptions.JobNumberNotFoundException;
import com.mypersonal.jobexercises.Services.JobsService;

import com.mypersonal.jobexercises.models.Job;
import com.mypersonal.jobexercises.repositories.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


//This is the business layer, where the mechanism for doing different tasks
//are defined
@Service
public class JobsServiceImpl implements JobsService {

    @Autowired
    JobsRepository jobsRepository;


    @Override
    public Long createNewJob(Job job) {
        return jobsRepository.save(job).getId();
    }

    @Override
    public Job fetchJob(Long id) {
        return jobsRepository.findById(id).orElseThrow(() -> new JobNumberNotFoundException(id));
    }

//    @Override
//    public List<Job> findAllJobs(){
//        return JobsRepository.findAll();
//    }
}