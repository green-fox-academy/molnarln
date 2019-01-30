package postIt;

public class PostItObjects {
    public static void main(String[] args) {
        PostIt post1 = new PostIt();
        post1.backGroundColor = "orange";
        post1.text = "Idea 1";
        post1.color = "blue";

        PostIt post2 = new PostIt();
        post2.backGroundColor = "pink";
        post2.text = "Awesome";
        post2.color = "black";

        PostIt post3 = new PostIt();
        post3.backGroundColor = "yellow";
        post3.text = "Superb";
        post3.color = "green";
        System.out.println(post1.backGroundColor);
    }
}
