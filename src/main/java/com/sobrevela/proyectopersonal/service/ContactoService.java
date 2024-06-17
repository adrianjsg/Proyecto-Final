package com.sobrevela.proyectopersonal.service;

import com.sobrevela.proyectopersonal.model.Contacto;
import com.sobrevela.proyectopersonal.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService {
    @Autowired
    private ContactoRepository contactoRepository;

    public void guardarContacto(Contacto contacto) {
        contactoRepository.save(contacto);
    }
}
