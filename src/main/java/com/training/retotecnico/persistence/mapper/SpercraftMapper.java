package com.training.retotecnico.persistence.mapper;

import com.training.retotecnico.domain.Spercraft;
import com.training.retotecnico.persistence.entity.NaveEspacial;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SpercraftMapper {
    @Mappings({
            @Mapping(source = "id", target = "spercraftId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "actividad", target = "activity"),
            @Mapping(source = "pais", target = "country"),
            @Mapping(source = "combustible", target = "fuel"),
            @Mapping(source = "potencia", target = "power"),
    })
    Spercraft toSpercraft(NaveEspacial naveEspacial);
    List<Spercraft> toSpercrafts(List<NaveEspacial> naveEspacials);

    @InheritInverseConfiguration
    NaveEspacial toNaveEspacial(Spercraft spercraft);
}
