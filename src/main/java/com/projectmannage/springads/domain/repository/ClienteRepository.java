package com.projectmannage.springads.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projectmannage.springads.domain.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Você já ganha save(), findAll(), findById(), deleteById() de graça aqui.
}
