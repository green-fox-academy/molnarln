package com.example.reddit_project.repository;

import com.example.reddit_project.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
