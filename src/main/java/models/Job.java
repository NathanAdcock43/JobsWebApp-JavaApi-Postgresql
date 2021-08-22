package models;

import javax.persistence.*;

@Entity
@Table(name = "JOB")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobName;

    private String jobStatus;

    public Job(Long id, String jobName, String jobStatus) {
        this.id = id;
        this.jobName = jobName;
        this.jobStatus = jobStatus;
    }

    public Job(String jobName, String jobStatus) {
        this.jobName = jobName;
        this.jobStatus = jobStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobDescription) {
        this.jobStatus = jobDescription;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobName='" + jobName + '\'' +
                ", jobDescription='" + jobStatus + '\'' +
                '}';
    }


}
