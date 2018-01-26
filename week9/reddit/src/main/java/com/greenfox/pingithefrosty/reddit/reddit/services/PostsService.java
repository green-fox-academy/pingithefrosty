package com.greenfox.pingithefrosty.reddit.reddit.services;

import com.greenfox.pingithefrosty.reddit.reddit.models.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostsService {
  List<Post> findAll();
  void save(Post post);
  void delete(Long id);
  Post findOne(Long id);
}
