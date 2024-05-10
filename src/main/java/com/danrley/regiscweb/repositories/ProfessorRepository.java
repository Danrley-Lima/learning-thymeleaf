package com.danrley.regiscweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danrley.regiscweb.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
