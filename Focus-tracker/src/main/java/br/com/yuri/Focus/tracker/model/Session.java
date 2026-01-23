package br.com.yuri.Focus.tracker.model;

import java.time.LocalDateTime;

public class Session {

    private Long id;
    private String title;
    private LocalDateTime beginDate;
    private LocalDateTime endDate;
    private Category category;

    public Session(String title, LocalDateTime beginDate, LocalDateTime endDate, Category category) {
        this.title = title;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Category getCategory() {
        return category;
    }
}
