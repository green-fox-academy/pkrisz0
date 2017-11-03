package com.greenfox.pkrisz0.reddit.service;

import com.greenfox.pkrisz0.reddit.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    public void upVote(long id){
        postRepo.findOne(id).setScore(postRepo.findOne(id).getScore() + 1);
        postRepo.save(postRepo.findOne(id));
    }

    public void downVote(long id){
        postRepo.findOne(id).setScore(postRepo.findOne(id).getScore() - 1);
        postRepo.save(postRepo.findOne(id));
    }
}
