package com.mypersonal.jobexercises.models;

import javax.persistence.*;

//This model establishes the shape of the Jobs object and the way
// that the data for the objects are stored in the DataBase

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String jobName;

    private String jobStatus;

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
