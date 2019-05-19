package com.example.springbootschedule.dao;

import com.example.springbootschedule.bean.Cron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CronDao extends JpaRepository<Cron,String> {

    @Query(value = "select top 1  *  from cron  ",nativeQuery = true)
    public Cron getCron();
}