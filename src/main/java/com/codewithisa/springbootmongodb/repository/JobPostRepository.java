package com.codewithisa.springbootmongodb.repository;

import com.codewithisa.springbootmongodb.entity.JobPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPostRepository extends MongoRepository<JobPost, String> {
}
