package com.EternalBliss.EternalBliss.repository;

import com.EternalBliss.EternalBliss.model.review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reviewrepo extends JpaRepository<review, Long> {
}
