package com.coreserve.product.mappper;


import com.coreserve.product.dto.FournisseurDto;
import com.coreserve.product.modele.Fournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FournisseurMapper {
    FournisseurMapper INSTANCE = Mappers.getMapper(FournisseurMapper.class);

    Fournisseur dtoToFournisseur(FournisseurDto dto);

    FournisseurDto fournisseurToDto(Fournisseur fournisseur);

    List<Fournisseur> dtoToFournisseurList(List<FournisseurDto> dtoList);

    List<FournisseurDto> fournisseurListToDtoList(List<Fournisseur> fournisseurList);

}
