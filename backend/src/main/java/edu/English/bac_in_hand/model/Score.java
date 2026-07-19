package edu.English.bac_in_hand.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "scores")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "exam_attempt_id")
    private ExamAttempt examAttempt;

    private Double comprehensionScore;
    private Double languageScore;
    private Double writingScore;
    private Double totalScore;

    private LocalDateTime gradedAt;

    @PrePersist
    @PreUpdate
    private void caclulateScore() {
        this.totalScore = calculateTotal();

        if (this.gradedAt == null) {
            this.gradedAt = LocalDateTime.now();
        }
    }
    private Double calculateTotal() {
        Double total = 0.0;
        if (comprehensionScore != null) total += comprehensionScore;
        if (languageScore != null) total += languageScore;
        if (writingScore != null) total += writingScore;

        return total;
    }

    // Helper method to manually recalculate
    public void recalculateTotalScore() {
        this.totalScore = calculateTotal();
    }

    // Helper to check if all scores are present
    public boolean isComplete(){
        return comprehensionScore != null && languageScore != null && writingScore != null;
    }

}
