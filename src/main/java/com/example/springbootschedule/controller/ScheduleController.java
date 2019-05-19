package com.example.springbootschedule.controller;

import com.example.springbootschedule.bean.Cron;
import com.example.springbootschedule.dao.CronDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {
    @Autowired
    private CronDao cronDao;

    @GetMapping(value = "/test")
    public String success() throws Exception {
        Cron cron = cronDao.getCron();
        return "success";
    }
}
