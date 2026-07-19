package edu.English.bac_in_hand.repository;

import edu.English.bac_in_hand.model.ExamAttempt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamAttemptRepository extends JpaRepository<ExamAttempt, Long> {
    List<ExamAttempt> findByUserId(Long userId);
    List<ExamAttempt> findByUserIdAndExamId(Long userId, Long examId);
}
