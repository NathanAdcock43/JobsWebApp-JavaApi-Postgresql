package models;

import javax.persistence.*;

@Entity
@Table(name = "JOB")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobName;

    private String jobDescription;

    public Job(Long id, String jobName, String jobDescription) {
        this.id = id;
        this.jobName = jobName;
        this.jobDescription = jobDescription;
    }

    public Job(String jobName, String jobDescription) {
        this.jobName = jobName;
        this.jobDescription = jobDescription;
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

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobName='" + jobName + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                '}';
    }


}
