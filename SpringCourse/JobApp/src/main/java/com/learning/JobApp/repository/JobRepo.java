package com.learning.JobApp.repository;

import com.learning.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must have good experience on core of JAVA, about 4-5 years working with Spring Boot, experience working with Agile, Git, Kubernets", 1, List.of("Java", "Spring Boot", "Kubernet", "Agile", "Python"))
    ));

    public JobPost addJob(JobPost jobPost) {
        jobs.add(jobPost);
        return jobPost;
    }

    public List<JobPost> getAllJobs() {
        return this.jobs;
    }

}
