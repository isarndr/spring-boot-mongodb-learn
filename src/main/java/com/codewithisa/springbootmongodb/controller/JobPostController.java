package com.codewithisa.springbootmongodb.controller;

import com.codewithisa.springbootmongodb.entity.JobPost;
import com.codewithisa.springbootmongodb.service.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job-posts")
public class JobPostController {

    @Autowired
    JobPostService jobPostService;

    @GetMapping
    List<JobPost> getAllJobPosts(){
        return jobPostService.getAllJobPosts();
    }

    @PostMapping
    JobPost saveJobPost(@RequestBody JobPost jobPost){
        return jobPostService.saveJobPost(jobPost);
    }
}
