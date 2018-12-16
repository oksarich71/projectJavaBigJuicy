package com.codeclan.project.project.repositories.PubRepository;

import com.codeclan.project.project.models.Pub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PubRepository extends JpaRepository<Pub, Long>, PubRepositoryCustom {
}
