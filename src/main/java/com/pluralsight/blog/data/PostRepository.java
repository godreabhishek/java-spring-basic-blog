package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
public class PostRepository {

    public List<Post> getAllPosts() {
        return null;
    }


    public Post findById(Long id) {
        return null;
    }
}
