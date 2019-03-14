package com.example.reddit_project.service;

import com.example.reddit_project.CustomException;
import com.example.reddit_project.model.Post;
import com.example.reddit_project.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public PostRepository getPostRepository() {
        return postRepository;
    }

/*
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
*/

    public void savePost(Post postToSave) {
        this.postRepository.save(postToSave);
    }

    public Post findPostById(Long id) throws CustomException {
        return this.postRepository.findById(id).orElseThrow(()->new CustomException("Post not found!"));
    }

    public List<Post> createPagesOfTenPosts(int pageNumber) {
        List<Post> sortedByVotes = new ArrayList<>();
        List<Post> allPosts = new ArrayList<>();
        this.postRepository.findAll().forEach(allPosts::add);
        Pageable p = PageRequest.of(0, 10);
        sortedByVotes = this.postRepository.findAllByOrderByVotesDesc(p);
        return sortedByVotes;
    }


/*        sortedByVotes = allPosts.stream()
                .sorted(new Comparator<Post>() {
                    @Override
                    public int compare(Post o1, Post o2) {
                        if (o1.getVotes() >= o2.getVotes()) {
                            return -1;
                        }
                        return 1;
                    }
                })
                .collect(Collectors.toList());
        List<Post> postToRender = new ArrayList<>();

        for (int i = pageNumber * 10; *//*(pageNumber >= sortedByVotes.size()) ? *//*(i < ((pageNumber * 10) + (10)))*//* : (i < (pageNumber * 10) + 10)*//*; i++) {
            postToRender.add(sortedByVotes.get(i));
        }
        return postToRender;
    } */


}
