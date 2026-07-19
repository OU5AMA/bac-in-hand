package edu.English.bac_in_hand.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class StudentAnswerDto {
    private Long id;
    @NotNull(message = "Question ID is required")
    private Long questionId;
    @NotBlank(message = "Answer content is required")
    private String answerContent;
    private Double pointsEarned;
    private String aiComments;
}
