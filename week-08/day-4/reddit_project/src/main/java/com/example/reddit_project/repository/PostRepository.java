package com.example.reddit_project.repository;

import com.example.reddit_project.model.Post;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByOrderByVotesDesc(Pageable pageable);
    Integer countAllBy();
    List<Post> findByOrderByVotesDesc (Pageable pageable); //it does exactly the same as the first method!
}
