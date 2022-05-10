package com.zappts.zappts.repository;

import com.zappts.zappts.domain.Carta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaRepository extends JpaRepository<Carta, Integer> {
}