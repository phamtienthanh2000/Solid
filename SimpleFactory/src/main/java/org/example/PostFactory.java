package org.example;

/**
 * This class acts as a simple factory for creation of
 * different posts on web site.
 */
public class PostFactory {

    public static Post createPost(String type) {
        switch (type) {
            case "product":
                return new ProductPost();
            case "news":
                return new NewsPost();
            case "blog":
                return new BlogPost();
            default:
                throw new IllegalArgumentException("Post type is unknown");
        }
    }

}
