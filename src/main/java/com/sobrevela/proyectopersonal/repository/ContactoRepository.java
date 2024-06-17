package com.sobrevela.proyectopersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sobrevela.proyectopersonal.model.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {
}
