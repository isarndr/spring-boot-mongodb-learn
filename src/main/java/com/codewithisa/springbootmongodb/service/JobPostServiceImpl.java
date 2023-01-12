package com.codewithisa.springbootmongodb.service;

import com.codewithisa.springbootmongodb.entity.JobPost;
import com.codewithisa.springbootmongodb.repository.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostServiceImpl implements JobPostService{

    @Autowired
    JobPostRepository jobPostRepository;

    @Override
    public List<JobPost> getAllJobPosts() {
        return jobPostRepository.findAll();
    }

    @Override
    public JobPost saveJobPost(JobPost jobPost) {
        return jobPostRepository.save(jobPost);
    }
}
