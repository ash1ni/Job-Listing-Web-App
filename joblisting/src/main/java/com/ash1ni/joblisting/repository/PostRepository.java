package com.ash1ni.joblisting.repository;

import com.ash1ni.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String>
{


}
