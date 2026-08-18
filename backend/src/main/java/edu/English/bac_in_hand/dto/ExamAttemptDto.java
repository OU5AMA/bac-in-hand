package edu.English.bac_in_hand.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ExamAttemptDto {
    private Long id;
    private Long userId;
    private Long examId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Boolean completed;
    private List<StudentAnswerDto> studentAnswers;
    private ScoreDto score;
}
