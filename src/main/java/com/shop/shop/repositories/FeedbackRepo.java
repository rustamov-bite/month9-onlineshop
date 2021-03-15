package com.shop.shop.repositories;

import com.shop.shop.models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepo extends JpaRepository<Feedback, Long> {
}
