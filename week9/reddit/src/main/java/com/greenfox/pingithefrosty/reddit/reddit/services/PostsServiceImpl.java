package com.greenfox.pingithefrosty.reddit.reddit.services;

import com.greenfox.pingithefrosty.reddit.reddit.models.Post;
import com.greenfox.pingithefrosty.reddit.reddit.repositories.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostsServiceImpl implements PostsService {

  @Autowired
  PostsRepository postsRepository;


  @Override
  public List<Post> findAll() {
    List<Post> posts = new ArrayList<>();
    postsRepository.findAll().forEach(posts::add);
    return posts;
  }

  @Override
  public void save(Post post) {
    postsRepository.save(post);
  }

  @Override
  public void delete(Long id) {
    postsRepository.delete(id);
  }

  @Override
  public Post findOne(Long id) {
    return postsRepository.findOne(id);
  }
}
