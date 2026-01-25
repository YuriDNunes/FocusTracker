package br.com.yuri.Focus.tracker.data.dto;

import br.com.yuri.Focus.tracker.model.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    private LocalDateTime endDate;

    @NotNull
    private Category category;
}
