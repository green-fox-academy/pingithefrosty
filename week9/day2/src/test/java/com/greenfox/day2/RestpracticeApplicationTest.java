package com.greenfox.day2;

import com.example.greenfox.restpractice.restpractice.RestpracticeApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
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

  @Test
  public void doublingTest() throws Exception {
    mockMvc.perform(
        get("/doubling?input=15"))
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json;charset=UTF-8"))
        .andExpect(jsonPath("$.received", is(15)))
        .andExpect(jsonPath("$.result", is(30)));
  }

  @Test
  public void greeterTest() throws Exception {
    mockMvc.perform(
        get("/greeter?name=Adam&title=programmer"))
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json;charset=UTF-8"))
        .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Adam, my dear programmer!")));
  }

  @Test
  public void appendaTest() throws Exception {
    mockMvc.perform(
        get("/appenda/kuty"))
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json;charset=UTF-8"))
        .andExpect(jsonPath("$.appended", is("kutya")));
  }

  @Test
  public void doUntilTest() throws Exception {
    mockMvc.perform(
        post("/dountil/sum")
            .contentType("application/json;charset=UTF-8")
            .content("{\"until\": 5}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result", is(15)));
    mockMvc.perform(
        post("/dountil/factor")
            .contentType("application/json;charset=UTF-8")
            .content("{\"until\": 5}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result", is(120)));
  }

  @Test
  public void arrayHandlerTest() throws Exception {
    //int[] resultIntArray = {2, 4, 10, 20};
    mockMvc.perform(
        post("/arrays")
            .contentType("application/json;charset=UTF-8")
            .content("{\"what\": \"sum\", \"numbers\": [1, 2, 5, 10]}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result", is(18)));
    mockMvc.perform(
        post("/arrays")
            .contentType("application/json;charset=UTF-8")
            .content("{\"what\": \"multiply\", \"numbers\": [1, 2, 5, 10]}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result", is(100)));
/*    mockMvc.perform(
        post("/arrays")
            .contentType("application/json;charset=UTF-8")
            .content("{\"what\": \"double\", \"numbers\": [1, 2, 5, 10]}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result", is(resultIntArray)));*/
    mockMvc.perform(
        post("/arrays")
            .contentType("application/json;charset=UTF-8")
            .content("{\"what\": \"divide\", \"numbers\": [1, 2, 5, 10]}"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("Please provide what to do with the numbers!")));
  }
}