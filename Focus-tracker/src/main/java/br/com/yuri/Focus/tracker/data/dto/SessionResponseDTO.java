package br.com.yuri.Focus.tracker.data.dto;

import br.com.yuri.Focus.tracker.model.Category;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class SessionResponseDTO {

    private Long id;
    private String title;
    private LocalDateTime beginDate;
    private LocalDateTime endDate;
    private Category category;

}
