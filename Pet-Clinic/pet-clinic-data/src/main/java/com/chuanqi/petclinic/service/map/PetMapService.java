package com.chuanqi.petclinic.service.map;

import com.chuanqi.petclinic.model.Pet;
import com.chuanqi.petclinic.service.PetService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Pet object) {

    }

    @Override
    public Pet save(Pet object) {
        return null;
    }

    @Override
    public Pet findById(Long id) {
        return null;
    }
}
