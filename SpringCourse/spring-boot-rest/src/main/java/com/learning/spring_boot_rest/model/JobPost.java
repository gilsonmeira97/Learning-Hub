package com.learning.spring_boot_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class JobPost {
    @Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        JobPost jobPost = (JobPost) o;
        return postId == jobPost.postId && reqExperience == jobPost.reqExperience && Objects.equals(postProfile, jobPost.postProfile) && Objects.equals(postDesc, jobPost.postDesc) && Objects.equals(postTechStack, jobPost.postTechStack);
    }

}
