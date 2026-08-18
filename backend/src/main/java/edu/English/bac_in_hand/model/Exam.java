package edu.English.bac_in_hand.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "exams")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;
    private String description;
    @Column(name = "exam_year")
    private Integer year;

    @Enumerated(EnumType.STRING)
    private ExamType examType;

    @Enumerated(EnumType.STRING)
    private StudyStream studyStream;
    private Integer durationMinutes;
    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL)
    private Set<Question> questions = new HashSet<>();

    @OneToMany (mappedBy = "exam", cascade = CascadeType.ALL)
    private Set<ExamAttempt> examAttempts = new HashSet<>();

    public enum ExamType {
        NORMAL,
        MAKEUP
    }

    public enum StudyStream {
        SCIENCE,
        COMMERCE,
        LITERATURE,
        HUMAN_SCIENCE,
    }
}
