package com.ash1ni.joblisting.repository;

import com.ash1ni.joblisting.model.Post;

import java.util.List;

public interface SearchRepository
{
    List<Post> findByText(String text);
}
