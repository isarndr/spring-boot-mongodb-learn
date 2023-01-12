package com.codewithisa.springbootmongodb.service;

import com.codewithisa.springbootmongodb.entity.JobPost;

import java.util.List;

public interface JobPostService {
    List<JobPost> getAllJobPosts();

    JobPost saveJobPost(JobPost jobPost);
}
