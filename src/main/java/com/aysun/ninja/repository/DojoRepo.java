package com.aysun.ninja.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aysun.ninja.models.Dojo;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long> {
	
}