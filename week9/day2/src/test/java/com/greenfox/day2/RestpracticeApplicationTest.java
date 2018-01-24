package com.greenfox.day2;

import com.example.greenfox.restpractice.restpractice.RestpracticeApplication;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestpracticeApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class RestpracticeApplicationTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  /*@Test
  public void testUnsuccessfulSignUp() throws Exception {
    mockMvc.perform(post("/user/signup")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"email\": \"name@example.com\", \"password\": \"12345\"}"))
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json;charset=UTF-8"))
        .andExpect(jsonPath("$.result", is("fail")))
        .andExpect(jsonPath("$.message", is("email address already exists")));
  }*/

  @Test
  public void doUntilTest() throws Exception {
    mockMvc.perform(
        post("/dountil/sum")
            .contentType("application/json;charset=UTF-8")
            .content("{\"until\": 10}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is(5)))
        .andExpect(jsonPath("$.result", is(15)));
  }

  @Test
  public void doublingTest() throws Exception {
    mockMvc.perform(
        get("/doubling?input=15"))
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json;charset=UTF-8"))
        .andExpect(jsonPath("$.received", is(15)))
        .andExpect(jsonPath("$.result", is(30)));

  }
}