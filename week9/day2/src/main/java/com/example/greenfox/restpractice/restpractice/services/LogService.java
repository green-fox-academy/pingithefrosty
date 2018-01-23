package com.example.greenfox.restpractice.restpractice.services;

import com.example.greenfox.restpractice.restpractice.models.logger.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface LogService {
  void save(Log log);
  List<Log> findAll();
  Page<Log> findByPage(Pageable pageable);
}
