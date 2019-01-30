package blogpost;

public class BlogPostObjects {
    public static void main(String[] args) {

        BlogPost blog1 = new BlogPost();
        blog1.authorName = "John Doe";
        blog1.title = "Lorem Ipsum";
        blog1.publicationDate = "2000.05.04.";
        blog1.text = "Lorem ipsum dolor sit amet.";

        BlogPost blog2 = new BlogPost();
        blog2.authorName = "Tim Urban";
        blog2.title = "Wait but why";
        blog2.publicationDate = "2010.10.10.";
        blog2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        BlogPost blog3 = new BlogPost();
        blog3.authorName = "William Turton";
        blog3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        blog3.publicationDate = "2017.03.28.";
        blog3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

    }
}
