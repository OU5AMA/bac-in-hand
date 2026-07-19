package edu.English.bac_in_hand.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExamAttemptDto {
    private Long id;
    private Long userId;
    private Long examId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Boolean Completed;
    private List<StudentAnswerDto> studentAnswers;
    private ScoreDto score;
}
