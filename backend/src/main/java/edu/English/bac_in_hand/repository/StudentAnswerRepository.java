package edu.English.bac_in_hand.repository;

import edu.English.bac_in_hand.model.StudentAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentAnswerRepository extends JpaRepository<StudentAnswer, Long> {
    List<StudentAnswer> findByExamAttemptUserId(Long userId);
    List<StudentAnswer> findByExamAttemptIdAndQuestionId(Long examAttemptId, Long questionId);
}
