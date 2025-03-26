package com.learning.JobApp.service;

import com.learning.JobApp.model.JobPost;
import com.learning.JobApp.repository.JobRepo;
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

}
