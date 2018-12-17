package com.codeclan.project.project.repositories.PubRepository;

import com.codeclan.project.project.models.Pub;
import com.codeclan.project.project.projections.PubProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = PubProjection.class)
public interface PubRepository extends JpaRepository<Pub, Long>, PubRepositoryCustom {
}
