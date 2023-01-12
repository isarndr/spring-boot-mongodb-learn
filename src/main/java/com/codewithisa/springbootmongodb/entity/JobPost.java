package com.codewithisa.springbootmongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "job post")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JobPost {
    private String profile;
    private String desc;
    private Integer exp;
    private String[] techs;
}
