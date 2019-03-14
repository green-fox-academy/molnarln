package com.example.reddit_project.service;

import com.example.reddit_project.model.Post;
import com.example.reddit_project.repository.PostRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PostService {


    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {

        this.postRepository = postRepository;

    }

    public void addPost (Post post){
        postRepository.save(post);
    }

    public PostRepository getPostRepository() {
        return postRepository;
    }

    public List<Post> sortPostsByVotes(){
        List<Post> sortedByVotes = new ArrayList<>();
        List<Post> allPosts = new ArrayList<>();

        this.postRepository.findAll().forEach(allPosts::add);
        sortedByVotes = allPosts.stream()
                .sorted(new Comparator<Post>() {
                    @Override
                    public int compare(Post o1, Post o2) {
                        if (o1.getVotes()>=o2.getVotes()){
                            return -1;
                        }
                        return 1;
                    }
                })
                .collect(Collectors.toList());
        return sortedByVotes;
    }
}
