package com.example.reddit_project.service;

import com.example.reddit_project.model.Post;
import com.example.reddit_project.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostService {


    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {

        this.postRepository = postRepository;

    }

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public PostRepository getPostRepository() {
        return postRepository;
    }

    public void savePost(Post postToSave) {
        this.postRepository.save(postToSave);
    }

    public Post findPostById(Long id) {
        return this.postRepository.findById(id).get();
    }

    public List<Post> createPagesOfTenPosts(int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 10);
        return this.postRepository.findAllByOrderByVotesDesc(pageable);
    }

    public List<Integer> pages(){
        List<Integer> allPages = new ArrayList<>();
        long numberOfPosts = postRepository.countAllBy();
        long maxPage = numberOfPosts/10;
        for (int i = 0; i <= maxPage ; i++) {
            allPages.add(i);
        }
        return allPages;
    }
}
