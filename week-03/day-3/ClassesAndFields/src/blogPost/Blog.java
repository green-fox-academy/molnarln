package blogpost;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blogPosts;

    public Blog(){
        blogPosts = new ArrayList<>();

    }
    public void addBlogPosts(BlogPost blogPostToAdd){
        blogPosts.add(blogPostToAdd);
    }

    public void deleteBlogPost(int indexAt){

        blogPosts.remove(indexAt);
    }
    public void updateBlogPost (int indexAt, BlogPost newBlogPost){
        blogPosts.set(indexAt, newBlogPost);

    }
}
