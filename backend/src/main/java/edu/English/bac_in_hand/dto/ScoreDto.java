package edu.English.bac_in_hand.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ScoreDto {
    private Long id;
    private Long examAttemptId;
    private Double pointsEarned;
    private Double comprehensionScore;
    private Double languageScore;
    private Double writingScore;
    private Double totalScore;
    private LocalDateTime gradedAt;
}
