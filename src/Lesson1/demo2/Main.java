package Lesson1.demo2;

public class Main {
    public static void main(String[] args) {
        Post[] posts = {
                new Post(1,1,"first post","the body of the first post"),
                new Post(2,2,"second post","the body of the second post"),
                new Post(3,3,"third post","the body of the third post"),
                new Post(4,4,"fourth post","the body of the fourth post"),
                new Post(5,5,"fifth post","the body of the fifth post")
        };
        for (Post post : posts) {
            System.out.println(post);
        }
    }
}
