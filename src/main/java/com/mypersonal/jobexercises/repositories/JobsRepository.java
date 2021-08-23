package com.mypersonal.jobexercises.repositories;


import com.mypersonal.jobexercises.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Responsible for Data Access, JPA repository will provide specific data methods
@Repository
public interface JobsRepository extends JpaRepository<Job,Long> {

}
