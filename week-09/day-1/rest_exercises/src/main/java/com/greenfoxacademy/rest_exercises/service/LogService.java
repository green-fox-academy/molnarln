package com.greenfoxacademy.rest_exercises.service;

import com.greenfoxacademy.rest_exercises.model.Log;
import com.greenfoxacademy.rest_exercises.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    private LogRepository logRepository;

    public LogService() {
    }

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public void saveLog(Log log){
        logRepository.save(log);
    }
}
