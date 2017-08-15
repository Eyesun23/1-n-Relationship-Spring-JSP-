package com.aysun.ninja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aysun.ninja.models.*;
import com.aysun.ninja.repository.NinjaRepo;

@Service
public class NinjaService {

	private NinjaRepo ninjaRepo;
	
	public NinjaService(NinjaRepo ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public void addNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
	}
	
	public List<Ninja> getNinjasAtDojo(Dojo dojo) {
		return ninjaRepo.findByDojo(dojo);
	}
}