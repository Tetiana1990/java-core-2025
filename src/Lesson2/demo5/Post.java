package Lesson2.demo5;

import java.util.ArrayList;
import java.util.List;

public class Post {
   protected int id;
    private String title;
    private String body;
    List<Comment> comments;

    public Post(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.comments = new ArrayList<>();
    }
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        return "Post{" +
                "body='" + body + '\'' +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", comments=" + comments +
                '}';
    }
}
