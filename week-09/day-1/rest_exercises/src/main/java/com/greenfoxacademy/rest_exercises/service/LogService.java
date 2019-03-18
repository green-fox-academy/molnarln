package com.greenfoxacademy.rest_exercises.service;

import com.greenfoxacademy.rest_exercises.model.Log;
import com.greenfoxacademy.rest_exercises.model.LogEntries;
import com.greenfoxacademy.rest_exercises.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public Long countLogs(){
        return logRepository.count();
    }

    public List<Log> getLogs(){
        List<Log> listOfLogs = new ArrayList<>();
        logRepository.findAll().forEach(listOfLogs::add);
        return listOfLogs;
    }

    public void setLogList(LogEntries logEntries){
        List<Log> logs = new ArrayList<>();
        logRepository.findAll().forEach(logs::add);
        logEntries.setEntries(logs);
    }

    public void setLogCount(LogEntries logEntries){
        Long count = logRepository.count();
        logEntries.setEntry_count(count);
    }
}
