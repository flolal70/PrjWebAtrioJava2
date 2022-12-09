package com.webatrio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webatrio.model.Personne;

@Repository
public interface PersonneRepository extends CrudRepository<Personne, Integer> {

}
