package com.learning.spring_boot_rest.service;

import com.learning.spring_boot_rest.model.JobPost;
import com.learning.spring_boot_rest.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepo repo;

    public JobPost addJob(JobPost jobPost) {
        return repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }

    public JobPost getJobById(Integer id){
        return repo.getJobById(id);
    }

    public JobPost updateJob(JobPost job) {
        return repo.updateJob(job);
    }

    public boolean removeJob(JobPost job) {
        return repo.removeJob(job);
    }


}
