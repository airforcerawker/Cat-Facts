package com.example.ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ninjas.models.Ninja;
import com.example.ninjas.repositories.NinjaRepository;

@Service
public class NinjaServices {
	
	private NinjaRepository ninjaRepo;
	
	public NinjaServices(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public Ninja create(Ninja newNinja) {
		return ninjaRepo.save(newNinja);
	}
	
	public List<Ninja> getAll(){
		return (List<Ninja>) ninjaRepo.findAll();
	}
	
	public Ninja getOne(Long id) {
		Optional<Ninja> ninja = ninjaRepo.findById(id);
		return ninja.isPresent() ? ninja.get() : null;
	}
	
	public Ninja update(Ninja toUpdate, Long id) {
		return ninjaRepo.save(toUpdate);
	}
	
	public void delete(Long id) {
		ninjaRepo.deleteById(id);
	}
	
}
