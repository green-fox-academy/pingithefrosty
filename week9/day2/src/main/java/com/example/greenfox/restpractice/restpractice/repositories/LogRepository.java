package com.example.greenfox.restpractice.restpractice.repositories;

import com.example.greenfox.restpractice.restpractice.models.logger.Log;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends PagingAndSortingRepository<Log, Long> {
}
