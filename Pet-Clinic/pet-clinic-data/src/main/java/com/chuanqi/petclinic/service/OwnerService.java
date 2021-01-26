package com.chuanqi.petclinic.service;

import com.chuanqi.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CRUDService<Owner, Long>{
    Owner findByLastName(String lastName);
}
