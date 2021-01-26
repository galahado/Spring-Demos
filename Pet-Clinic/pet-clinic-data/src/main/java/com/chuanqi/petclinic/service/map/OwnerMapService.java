package com.chuanqi.petclinic.service.map;

import com.chuanqi.petclinic.model.Owner;
import com.chuanqi.petclinic.service.CRUDService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CRUDService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
