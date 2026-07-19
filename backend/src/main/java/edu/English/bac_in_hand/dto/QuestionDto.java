package edu.English.bac_in_hand.dto;

import edu.English.bac_in_hand.model.Question;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.util.List;

@Data
public class QuestionDto {
    private Long id;
    @NotBlank(message = "Content is required")
    private String content;
    @NotNull(message = "Question type is required")
    private Question.QuestionType questionType;
    @Positive(message = "Points must positive")
    private Integer points;
    private Long examId;
    private List<AnswerDto> possibleAnswers;
    private Long correctAnswerId;
}
