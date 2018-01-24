package com.example.greenfox.restpractice.restpractice.models.logger;

import com.example.greenfox.restpractice.restpractice.models.RestResponse;
import com.example.greenfox.restpractice.restpractice.services.LogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LogResponse extends RestResponse {
  private final LogServiceImpl logService;
  private List<Log> entries;
  private int entry_count;

  @Autowired
  public LogResponse(LogServiceImpl logService) {
    this.logService = logService;
    this.entries = logService.findAll();
    this.entry_count = getEntries().size();
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public int getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(int entry_count) {
    this.entry_count = entry_count;
  }
}
