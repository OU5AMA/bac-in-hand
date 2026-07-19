package edu.English.bac_in_hand.dto;

import edu.English.bac_in_hand.model.Exam;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ExamDto {
    private Long id;

    @NotBlank(message = "Title is required")
    private String title;
    private String description;
    @NotNull(message = "Year is required")
    private Integer year;
    @NotNull(message = "Exam type is required")
    private Exam.ExamType examType;
    @NotNull(message = "Study stream is required")
    private Exam.StudyStream studyStream;
    @Positive(message = "Duration must positive")
    private Integer durationMinutes;
}
