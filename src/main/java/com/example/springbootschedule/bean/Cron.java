package com.example.springbootschedule.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "cron")
public class Cron {

    @Id
    private Long cron_id ;

    private String cron ;

    public Cron() {
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public Long getCron_id() {
        return cron_id;
    }

    public void setCron_id(Long cron_id) {
        this.cron_id = cron_id;
    }
}
