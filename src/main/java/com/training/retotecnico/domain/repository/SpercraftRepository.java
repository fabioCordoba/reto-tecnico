package com.training.retotecnico.domain.repository;

import com.training.retotecnico.domain.Spercraft;

import java.util.List;
import java.util.Optional;

public interface SpercraftRepository {
    List<Spercraft> getAll();
    Optional<Spercraft> getSpercraft(int spercraftId);
    Spercraft save(Spercraft spercraft);
    void delete(int spercraftId);
}
