package edu.English.bac_in_hand.repository;

import edu.English.bac_in_hand.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamRepository extends JpaRepository<Exam, Long> {
    List<Exam> findByYear (Integer year);
    List<Exam> findByExamType (Exam.ExamType examType);
    List<Exam> findByStream(Exam.StudyStream studyStream);
    List<Exam> findByYearAndExamTypeAndStudyStream(Integer year, Exam.ExamType examType, Exam.StudyStream studyStream);


}
