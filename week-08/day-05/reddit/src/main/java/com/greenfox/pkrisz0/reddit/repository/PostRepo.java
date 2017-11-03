package com.greenfox.pkrisz0.reddit.repository;

import com.greenfox.pkrisz0.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PostRepo extends CrudRepository<Post, Long> {
    List<Post> findAllByOrderByScoreDesc();
}
