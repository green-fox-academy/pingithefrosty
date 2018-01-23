package com.example.greenfox.restpractice.restpractice.services;

import com.example.greenfox.restpractice.restpractice.models.logger.Log;
import com.example.greenfox.restpractice.restpractice.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogServiceImpl implements LogService{
  @Autowired
  LogRepository logRepository;

  @Override
  public void save(Log log) {
    logRepository.save(log);
  }

  @Override
  public List<Log> findAll() {
    List<Log> logs = new ArrayList<>();
    logRepository.findAll().forEach(logs::add);
    return logs;
  }

  @Override
  public Page<Log> findByPage(Pageable pageable) {
    return logRepository.findAll(pageable);
  }
}
