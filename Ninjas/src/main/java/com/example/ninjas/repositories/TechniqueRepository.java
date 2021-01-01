package com.example.ninjas.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.ninjas.models.Technique;

public interface TechniqueRepository extends CrudRepository<Technique, Long> {

}
