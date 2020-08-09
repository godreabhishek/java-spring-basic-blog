package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class PostRepository {
      List<Post> ALL_POSTS = new ArrayList<>();
       public List<Post> getAllPosts() {
        return ALL_POSTS;

    }


    public Post findById(Long id) {
        return null;
    }
}
