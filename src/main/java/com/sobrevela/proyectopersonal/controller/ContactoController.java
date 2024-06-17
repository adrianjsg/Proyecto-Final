package com.sobrevela.proyectopersonal.controller;

import com.sobrevela.proyectopersonal.model.Contacto;
import com.sobrevela.proyectopersonal.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contactos")
public class ContactoController {

    @Autowired
    private ContactoRepository contactoRepository;

    @GetMapping
    public List<Contacto> getAllContactos() {
        return contactoRepository.findAll();
    }

    @PostMapping
    public Contacto createContacto(@RequestBody Contacto contacto) {
        return contactoRepository.save(contacto);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> deleteContacto(@PathVariable Long id) {
        if (contactoRepository.existsById(id)) {
            contactoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
