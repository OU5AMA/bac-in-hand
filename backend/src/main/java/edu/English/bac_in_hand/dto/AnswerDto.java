package edu.English.bac_in_hand.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AnswerDto {
    private Long id;

    @NotBlank(message = "Content is required")
    private String content;
    private Long questionId;
}
