package Services;

import models.Job;
import org.springframework.stereotype.Service;

@Service
public interface JobsService {

    Long createNewJob(Job job);
    Job fetchJob(Long id);
}
