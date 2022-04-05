package com.example.jpah2demo;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, String> {
	
}
