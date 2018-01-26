package com.greenfox.pingithefrosty.reddit.reddit.controllers;

import com.greenfox.pingithefrosty.reddit.reddit.DTO.PostRequestDTO;
import com.greenfox.pingithefrosty.reddit.reddit.DTO.PostResponseDTO;
import com.greenfox.pingithefrosty.reddit.reddit.models.Post;
import com.greenfox.pingithefrosty.reddit.reddit.services.PostsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostsController {

  @Autowired
  PostsServiceImpl postsService;

  @GetMapping("/posts")
  public ResponseEntity<List<PostResponseDTO>> listingThePosts() {
    List<Post> posts = postsService.findAll();
    List<PostResponseDTO> postResponses = new ArrayList<>();
    for (Post post : posts) {
      PostResponseDTO postResponse = new PostResponseDTO(post);
      postResponses.add(postResponse);
    }
    return new ResponseEntity<>(postResponses, HttpStatus.OK);
  }

  @PostMapping("/posts")
  public  ResponseEntity<Post> addingPost(@RequestBody Post postRequestBody) {
    String title = postRequestBody.getTitle();
    String url = postRequestBody.getUrl();
    Post post = new Post(title, url);
    postsService.save(post);
    return new ResponseEntity<>(post, HttpStatus.OK);
  }
/*
  @GetMapping("/greeter")
  public ResponseEntity<RestResponse> greeter(@RequestParam(value = "name", required = false) String name,
                                              @RequestParam(value = "title", required = false) String title) {
    String endpoint = "/greeter";
    String data;
    Log log = new Log();
    log.setEndPoint(endpoint);

    if (name == null) {
      data = null;
      log.setData(data);
      logService.save(log);
      return new ResponseEntity<>(new Error("Please provide a name!"), HttpStatus.OK);
    } else if (title == null) {
      data = null;
      log.setData(data);
      logService.save(log);
      return new ResponseEntity<>(new Error("Please provide a title!"), HttpStatus.OK);
    } else {
      data = "name=" + name + "&title=" + title;
      log.setData(data);
      logService.save(log);
      return new ResponseEntity<>(new Greeter(name, title), HttpStatus.OK);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<RestResponse> append(@PathVariable(value = "appendable") String appendable) {
    Log log = new Log("/appends/{appendable}", "appendable=" + appendable);
    logService.save(log);

    return new ResponseEntity<>(new Append(appendable), HttpStatus.OK);
  }

  @PostMapping("/dountil/{what}")
  public ResponseEntity<RestResponse> doUntil(@PathVariable(value = "what") String what,
                                              @RequestBody DoUntilGet doUntilGet) {
    Integer input = doUntilGet.getUntil();
    if (what.equals("sum")) {
      return new ResponseEntity<>(new DoUntilSum(input), HttpStatus.OK);
    } else if (what.equals("factor")) {
      return new ResponseEntity<>(new DoUntilFactor(input), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new Error("Please provide a number!"), HttpStatus.OK);
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity<RestResponse> arrayHandler(@RequestBody ArrayDecider arrayDecider) {
    String what = arrayDecider.getWhat();
    int[] numbers = arrayDecider.getNumbers();
    if (what.equals("double")) {
      return new ResponseEntity<>(new ArrayHandleDouble(numbers), HttpStatus.OK);
    } else if (what.equals("multiply")) {
      return new ResponseEntity<>(new ArrayHandleMultiply(numbers), HttpStatus.OK);
    } else if (what.equals("sum")) {
      return new ResponseEntity<>(new ArrayHandleSum(numbers), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new Error("Please provide what to do with the numbers!"), HttpStatus.BAD_REQUEST);
    }
  }

  @GetMapping("/log")
  public ResponseEntity<RestResponse> logger(@RequestParam(value = "count", required = false) Integer count,
                                             @RequestParam(value = "page", required = false) Integer page,
                                             @RequestParam(value = "q", required = false) String q) {
    if (count == null || page == null) {
      return new ResponseEntity<>(new LogResponse(logService), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new LogPages(logService, page, count), HttpStatus.OK);
    }
  }
}*/


}
