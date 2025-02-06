package com.example.workflow.repositories;

import com.example.workflow.entities.DemandeConge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeCongeReposiotry extends JpaRepository<DemandeConge, Long> {
}
