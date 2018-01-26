package com.greenfox.pingithefrosty.reddit.reddit.repositories;

import com.greenfox.pingithefrosty.reddit.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends CrudRepository<Post, Long> {
}
