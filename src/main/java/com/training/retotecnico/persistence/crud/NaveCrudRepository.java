package com.training.retotecnico.persistence.crud;

import com.training.retotecnico.persistence.entity.NaveEspacial;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface NaveCrudRepository extends CrudRepository<NaveEspacial, Integer> {
    Optional<NaveEspacial> findById(int id);
}
