package com.training.retotecnico.persistence;

import com.training.retotecnico.domain.Spercraft;
import com.training.retotecnico.domain.repository.SpercraftRepository;
import com.training.retotecnico.persistence.crud.NaveCrudRepository;
import com.training.retotecnico.persistence.entity.NaveEspacial;
import com.training.retotecnico.persistence.mapper.SpercraftMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class NaveRepository implements SpercraftRepository {

    @Autowired
    private NaveCrudRepository naveCrudRepository;

    @Autowired
    private SpercraftMapper mapper;

    @Override
    public List<Spercraft> getAll() {
        List<NaveEspacial> naveEspacials = (List<NaveEspacial>) naveCrudRepository.findAll();
        return mapper.toSpercrafts(naveEspacials);
    }

    @Override
    public Optional<Spercraft> getSpercraft(int spercraftId) {
        return naveCrudRepository.findById(spercraftId).map(naveEspacial -> mapper.toSpercraft(naveEspacial));
    }

    @Override
    public Spercraft save(Spercraft spercraft) {
        NaveEspacial naveEspacial = mapper.toNaveEspacial(spercraft);
        return mapper.toSpercraft(naveCrudRepository.save(naveEspacial));
    }

    @Override
    public void delete(int spercraftId) {
        naveCrudRepository.deleteById(spercraftId);
    }
}
