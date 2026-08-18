package edu.English.bac_in_hand.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "exam_attempts")
@Data
public class ExamAttempt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Boolean completed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exam_id")
    private Exam exam;

    @OneToMany(mappedBy = "examAttempt", cascade = CascadeType.ALL)
    private Set<StudentAnswer> studentAnswers = new HashSet<>();

    @OneToOne(mappedBy = "examAttempt", cascade = CascadeType.ALL)
    private Score score;
}
