package br.com.yuri.Focus.tracker.data.dto;

import br.com.yuri.Focus.tracker.model.Category;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SessionRequestDTO {

    @NotBlank
    private String title;

    private LocalDateTime beginDate;

    @Future
    private LocalDateTime endDate;

    @Enumerated(EnumType.STRING)
    private Category category;
}
