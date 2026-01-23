package br.com.yuri.Focus.tracker.data.dto;

import br.com.yuri.Focus.tracker.model.Category;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public class SessionRequestDTO {

    @NotBlank
    private String title;

    private LocalDateTime beginDate;

    @Future
    private LocalDateTime endDate;

    @NotBlank
    private Category category;

    public SessionRequestDTO(String title, LocalDateTime beginDate, LocalDateTime endDate, Category category) {
        this.title = title;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.category = category;
    }
}
