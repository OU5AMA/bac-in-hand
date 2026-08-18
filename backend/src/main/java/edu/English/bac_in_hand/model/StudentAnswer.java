package edu.English.bac_in_hand.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "student_answers")
public class StudentAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_answer_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "exam_attempt_id")
    private ExamAttempt examAttempt;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @Column(length = 2000)
    private String answerContent;

    private Double pointsEarned;
    private String aiComments;

}
