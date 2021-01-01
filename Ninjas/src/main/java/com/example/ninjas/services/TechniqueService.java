package com.example.ninjas.services;

import org.springframework.stereotype.Service;

import com.example.ninjas.models.Technique;
import com.example.ninjas.repositories.TechniqueRepository;

@Service
public class TechniqueService {
	
	private static TechniqueRepository techRepo;
	
	public TechniqueService(TechniqueRepository techRepo) {
		this.techRepo = techRepo;
	}

	public Technique create(Technique newTech) {
		return techRepo.save(newTech);
	}
	
}
