package com.learning.spring_boot_rest.repository;

import com.learning.spring_boot_rest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must have good experience on core of JAVA, about 4-5 years working with Spring Boot, experience working with Agile, Git, Kubernets", 1, List.of("Java", "Spring Boot", "Kubernet", "Agile", "Python")),
            new JobPost(2, "Frontend Developer", "Experienced in building responsive web applications using React and Angular. Must have knowledge of REST APIs, state management (Redux), and CSS frameworks like Tailwind or Bootstrap.", 2, List.of("React", "Angular", "JavaScript", "Redux", "TailwindCSS")),
            new JobPost(3, "Data Scientist", "Strong background in machine learning, statistical analysis, and data visualization. Proficient in Python libraries such as Pandas, NumPy, and Scikit-learn. Experience with cloud platforms like AWS or Azure is a plus.", 2, List.of("Python", "Machine Learning", "Pandas", "AWS", "Scikit-learn")),
            new JobPost(4, "DevOps Engineer", "Responsible for managing CI/CD pipelines, automating infrastructure, and ensuring system reliability. Must have hands-on experience with Docker, Jenkins, Terraform, and monitoring tools like Prometheus or Grafana.", 1, List.of("Docker", "Jenkins", "Terraform", "Prometheus", "Grafana")),
            new JobPost(5, "Mobile App Developer", "Skilled in developing cross-platform mobile applications using Flutter or React Native. Familiarity with Firebase for backend services and experience in integrating third-party APIs is required.", 4, List.of("Flutter", "React Native", "Firebase", "API Integration", "Dart")),
            new JobPost(6, "Cybersecurity Analyst", "Expertise in identifying vulnerabilities, conducting penetration tests, and implementing security measures. Knowledge of SIEM tools, network security protocols, and compliance standards like GDPR or ISO 27001 is essential.", 6, List.of("Cybersecurity", "Penetration Testing", "SIEM", "GDPR", "Network Security"))
    ));

    public JobPost addJob(JobPost jobPost) {
        jobs.add(jobPost);
        return jobPost;
    }

    public List<JobPost> getAllJobs() {
        return this.jobs;
    }

    public JobPost getJobById(int id) {
        for( JobPost job : jobs) {
            if (job.getPostId() == id) return job;
        }
        return null;
    }

    public JobPost updateJob(JobPost newJob) {
        for(JobPost job : jobs) {
            if(job.getPostId() == newJob.getPostId()) {
                return jobs.set(jobs.indexOf(job), newJob);
            }
        }
        return new JobPost();
    }

    public boolean removeJob(JobPost refJob) {
        return jobs.remove(refJob);
    }
}
