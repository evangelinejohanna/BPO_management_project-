package com.eva.bpo.app.repository;

import com.eva.bpo.app.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}