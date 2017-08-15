package com.aysun.ninja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aysun.ninja.models.Dojo;
import com.aysun.ninja.repository.DojoRepo;


@Service
public class DojoService {

	private DojoRepo dojoRepo;
	
	public DojoService(DojoRepo dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	public List<Dojo> getAllDojos() {
		return (List<Dojo>) dojoRepo.findAll();
	}
	
	public void addDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	
	public Dojo findDojoById(Long id) {
		return dojoRepo.findOne(id);
	}
}