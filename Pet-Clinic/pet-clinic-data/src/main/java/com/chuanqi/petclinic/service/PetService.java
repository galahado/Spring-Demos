package com.chuanqi.petclinic.service;

import com.chuanqi.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet FindById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
