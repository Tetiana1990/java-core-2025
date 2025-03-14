package Lesson2.demo5;

public class Comment {
   protected int postId;
    private int id;
    private String name;
    private String email;
    private String body;

    public Comment(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "body='" + body + '\'' +
                ", postId=" + postId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}




