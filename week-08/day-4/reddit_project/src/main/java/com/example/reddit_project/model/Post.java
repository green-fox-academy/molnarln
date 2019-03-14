package com.example.reddit_project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int votes;
    private String url;

    public Post() {
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
        this.votes = 0;
    }

    public Long getId() {
        return id;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void upVote (){
        this.votes++;
    }
    public void downVote (){
        this.votes--;
    }

}
