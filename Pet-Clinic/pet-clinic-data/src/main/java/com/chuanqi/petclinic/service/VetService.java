package com.chuanqi.petclinic.service;

import com.chuanqi.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet FindById(Long id);
    Vet save(Vet pet);
    Set<Vet> findAll();
}
