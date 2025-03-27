package com.learning.spring_boot_rest.controller;

import com.learning.spring_boot_rest.model.JobPost;
import com.learning.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JobRestController {

    @Autowired
    JobService service;

    @GetMapping("jobPosts")
//    @ResponseBody // Indicate that it just respond with data. Just needed when the class annotation is @Controller.
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping(path = "jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId) {
       return service.getJobById(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost job) {
        return service.addJob(job);
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost job) {
       return service.updateJob(job);
    }

    @DeleteMapping("jobPost")
    public boolean removeJob(@RequestBody JobPost job) {
        return service.removeJob(job);
    }
}
