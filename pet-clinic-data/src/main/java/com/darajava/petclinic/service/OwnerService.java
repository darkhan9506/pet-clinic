package com.darajava.petclinic.service;

import com.darajava.petclinic.models.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
