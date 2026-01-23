package br.com.yuri.Focus.tracker.data.dto;

import br.com.yuri.Focus.tracker.model.Category;

import java.time.LocalDateTime;

public class SessionResponseDTO {

    private Long id;
    private String title;
    private LocalDateTime beginDate;
    private LocalDateTime endDate;
    private Category category;

    public SessionResponseDTO(String title, LocalDateTime beginDate, LocalDateTime endDate, Category category) {
        this.title = title;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.category = category;
    }

}
