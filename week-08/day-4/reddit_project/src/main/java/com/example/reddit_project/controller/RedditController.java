package com.example.reddit_project.controller;

import com.example.reddit_project.model.Post;
import com.example.reddit_project.service.PostService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller

public class RedditController {

    PostService postService;

    @Autowired
    public RedditController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public String showMainPage (Model model) {

        model.addAttribute("posts", postService.sortPostsByVotes());
        return "index";

    }
    @RequestMapping(value = {"/submit"}, method = RequestMethod.GET)
    public String showAdderPage(Model model) {

        model.addAttribute("newpost", new Post());
        return "addpost";

    }

    @RequestMapping(value = {"/submit"}, method = RequestMethod.POST)
    public String addPost(Post post) {

        postService.getPostRepository().save(post);

        return "redirect:/";

    }

    @RequestMapping(value = "/{id}/upvote", method = RequestMethod.GET)
    public String upVotePost(@PathVariable("id") Long id){
        Post postToUpvote = postService.getPostRepository().findById(id).get();
        postToUpvote.upVote();
        postService.getPostRepository().save(postToUpvote);
        return "redirect:/";
    }

    @RequestMapping(value = "/{id}/downvote", method = RequestMethod.GET)
    public String downVote(@PathVariable("id") Long id){
        Post postToUpvote = postService.getPostRepository().findById(id).get();
        postToUpvote.downVote();
        postService.getPostRepository().save(postToUpvote);
        return "redirect:/";
    }

}
