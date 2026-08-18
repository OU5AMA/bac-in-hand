package edu.English.bac_in_hand.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 1000)
    private String content;
    @Enumerated(EnumType.STRING)
    private QuestionType questionType;
    private Integer points;
    @ManyToOne
    @JoinColumn(name = "exam_id")
    private Exam exam;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL )
    private Set<Answer> possibleAnswers = new HashSet<>();

    @OneToOne
    @JoinColumn(name = "correct_answer_id")
    private Answer correctAnswer;

    public enum QuestionType{
        COMPREHENSION,
        LANGUAGE,
        WRITING
    }
}
