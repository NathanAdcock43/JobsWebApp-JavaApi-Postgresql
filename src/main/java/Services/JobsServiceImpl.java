package Services;

import Exceptions.JobNumberNotFoundException;
import models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.JobsRepository;


//This is the business layer, where the mechanism for doing different tasks
//are defined
@Service
public class JobsServiceImpl implements JobsService{

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
}