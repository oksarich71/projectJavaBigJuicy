package com.codeclan.project.project.repositories.UserRepository;

import com.codeclan.project.project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {
}

