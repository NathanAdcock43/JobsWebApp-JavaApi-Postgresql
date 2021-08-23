package com.mypersonal.jobexercises.Services;
import com.mypersonal.jobexercises.models.Job;
import org.springframework.stereotype.Service;

//This interface is like a menu of all the tasks that can be done
//in this instance specifically interacting with jobs
@Service
public interface JobsService {

    Long createNewJob(Job job);
    Job fetchJob(Long id);
//    List<Job> findAllJobs();
}
