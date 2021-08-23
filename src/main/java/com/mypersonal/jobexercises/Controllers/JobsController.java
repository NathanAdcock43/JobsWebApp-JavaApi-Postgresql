package com.mypersonal.jobexercises.Controllers;


import com.mypersonal.jobexercises.Services.JobsService;
import com.mypersonal.jobexercises.models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//The controllers layer indicates which frontend endpoints correspond
//to which backend processes and allows for the transfer of data
@RestController @CrossOrigin( origins = "http://localhost:4200")
public class JobsController {

    @Autowired
    private JobsService jobsService;

    @PostMapping("/jobs/create")
    public ResponseEntity<Long> postNewJob(@RequestBody Job job){

        return ResponseEntity.ok(jobsService.createNewJob(job));
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> getAllJobs(){
        List<Job> jobs = jobsService.findAllJobs();
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }


    @GetMapping("/jobs/{jobId}")
    public ResponseEntity<Job> getJob(@PathVariable Long jobId){

        return ResponseEntity.ok(jobsService.fetchJob(jobId));
    }


}

