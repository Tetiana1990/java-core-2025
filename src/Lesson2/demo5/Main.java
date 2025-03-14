package Lesson2.demo5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Post>posts = new ArrayList<>();
        posts.add(new Post(1,"Post 1","first post"));
        posts.add(new Post(2,"Post 2","second post"));
        posts.add(new Post(3,"Post 3","third post"));

        List<Comment>comments = new ArrayList<>();
        comments.add(new Comment(1,1,"laborum","Eliseo@gardner.biz","Comment 1"));
        comments.add(new Comment(1,2,"earum","Jayne_Kuhic@sydney.com","Comment 2"));
        comments.add(new Comment(1,3,"animi","Dallas@ole.me","Comment 3"));
        comments.add(new Comment(2,8," dolorem","Mallory_Kunze@marie.org","Comment 4"));
        comments.add(new Comment(2,7,"voluptatum","Dallas@ole.me","Comment 5"));
        comments.add(new Comment(3,13,"sapiente","Kariane@jadyn.tv","Comment 6"));
        comments.add(new Comment(3,14,"repudiandae","Nathan@solon.io","Comment 7"));
        comments.add(new Comment(3,15,"tenetur","Maynard.Hodkiewicz@roberta.com","Comment"));

        for (Comment comment : comments){
            for (Post post : posts){
                if (post.id == comment.postId){
                    post.addComment(comment);
                }
            }
        }

        for (Post post : posts){
            System.out.println(post);
        }
    }
}
