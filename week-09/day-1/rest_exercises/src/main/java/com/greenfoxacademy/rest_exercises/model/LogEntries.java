package com.greenfoxacademy.rest_exercises.model;

import com.greenfoxacademy.rest_exercises.service.LogService;

import java.util.List;


public class LogEntries {
    private List<Log> entries;
    private Long entry_count;

    public LogEntries() {
    }

    public List<Log> getEntries() {
        return entries;
    }

    public void setEntries(List<Log> entries) {
        this.entries = entries;
    }

    public Long getEntry_count() {
        return entry_count;
    }

    public void setEntry_count(Long entry_count) {
        this.entry_count = entry_count;
    }
}
