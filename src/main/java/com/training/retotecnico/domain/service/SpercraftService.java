package com.training.retotecnico.domain.service;

import com.training.retotecnico.domain.Spercraft;
import com.training.retotecnico.domain.repository.SpercraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpercraftService {
    @Autowired
    private SpercraftRepository spercraftRepository;

    public List<Spercraft> getAll(){
        return spercraftRepository.getAll();
    }

    public Optional<Spercraft> getUser(int spercraftId){
        return spercraftRepository.getSpercraft(spercraftId);
    }

    public Spercraft save(Spercraft spercraft){
        return spercraftRepository.save(spercraft);
    }

    public boolean delete(int spercraftId){
        return getUser(spercraftId).map(user -> {
            spercraftRepository.delete(spercraftId);
            return true;
        }).orElse(false);
    }
}
