package com.sobrevela.proyectopersonal.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.sobrevela.proyectopersonal.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    // Consultas de base de datos personalizadas
}

