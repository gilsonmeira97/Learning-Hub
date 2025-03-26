package com.learning.JobApp;

import com.learning.JobApp.model.JobPost;
import com.learning.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JobController {

    @Autowired
    JobService service;

    @RequestMapping({"/", "home"})
    public String home() {
        return "index";
    }

    @GetMapping("/addjob")
    public String addJob() {
        return "addjob";
    }

    @GetMapping("viewalljobs")
    public String viewAllJobs(Model model) {
        model.addAttribute("jobPosts", service.getAllJobs());
        return "viewalljobs";
    }

    @PostMapping("handleForm")
    public String handleForm(@ModelAttribute JobPost jobPost) {
        service.addJob(jobPost);
        return "success";
    }

}
