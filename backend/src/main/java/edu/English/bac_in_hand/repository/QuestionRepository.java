package edu.English.bac_in_hand.repository;

import edu.English.bac_in_hand.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByExamId(Long examId);
    List<Question> findByExamIdAndQuestionType(Long examId, Question.QuestionType questionType);
}
