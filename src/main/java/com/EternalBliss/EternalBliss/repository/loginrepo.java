package com.EternalBliss.EternalBliss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.EternalBliss.EternalBliss.model.login;

public interface loginrepo extends JpaRepository<login, Integer> {
    login findByEmail(String email);
}