package Controllers;

import Services.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import models.Job;

//The controllers layer indicates which frontend endpoints correspond
//to which backend processes
@RestController @CrossOrigin( origins = "http://localhost:4200")
public class JobsController {

    @Autowired
    private JobsService jobsService;

//    private ResponseEntity<Long> postNewJob(@PathVariable Long jobId){
//
//        return ResponseEntity.ok(jobsService.fetchJob(jobId));
//    }

    @GetMapping("/jobs/{jobId}")
    public ResponseEntity<Job> getJob(@PathVariable Long jobId){

        return ResponseEntity.ok(jobsService.fetchJob(jobId));
    }
}
