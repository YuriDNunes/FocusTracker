package br.com.yuri.Focus.tracker.model;

import java.time.LocalDateTime;

public class Session {

    private String title;
    private LocalDateTime beginDate;
    private LocalDateTime endDate;
    private String category;

    public Session(String title, LocalDateTime begin, LocalDateTime end, String category){
        this.title = title;
        this.beginDate = begin;
        this.endDate = end;
        this.category = category;
    }

}
