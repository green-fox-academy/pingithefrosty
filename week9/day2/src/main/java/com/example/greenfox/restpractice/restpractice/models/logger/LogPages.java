package com.example.greenfox.restpractice.restpractice.models.logger;

import com.example.greenfox.restpractice.restpractice.models.RestResponse;
import com.example.greenfox.restpractice.restpractice.services.LogServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

public class LogPages extends RestResponse {
  private Page<Log> entries;
  private long entry_count;

  public LogPages() {
  }

  public LogPages(LogServiceImpl logService, int count, int page) {
    this.entries = logService.findByPage(new PageRequest(page, count, Sort.Direction.DESC, "createdAt"));
    this.entry_count = entries.getTotalElements();
  }

  public Page<Log> getEntries() {
    return entries;
  }

  public void setEntries(Page<Log> entries) {
    this.entries = entries;
  }

  public long getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(long entry_count) {
    this.entry_count = entry_count;
  }
}
