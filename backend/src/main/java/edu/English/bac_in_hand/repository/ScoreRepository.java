package edu.English.bac_in_hand.repository;

import edu.English.bac_in_hand.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Long> {
    List<Score> findByExamAttemptUserId(Long userId);

}
