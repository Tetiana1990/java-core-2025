package Lesson1.demo3;

public class Main {
    public static void main(String[] args) {
        Comment[] comments = {
                new Comment(1, 1, "first post", "user1@example.com", "the body of the first post"),
                new Comment(2, 2, "second post", "user2@example.com", "the body of the second post"),
                new Comment(3, 3, "third post", "user3@example.com", "the body of the third post"),
                new Comment(4, 4, "four post", "user4@example.com", "the body of the four post"),
                new Comment(5, 5, "five post", "user5@example.com", "the body of the five post")

        };
        for (Comment comment : comments) {
            System.out.println(comment);
        }
    }
}
