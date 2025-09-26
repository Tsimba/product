package com.coreserve.product.mappper;


import com.coreserve.product.dto.PrixTypeDto;
import com.coreserve.product.modele.PrixType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PrixTypeMapper {
    PrixType dtoToPrix(PrixTypeDto dto);

    PrixTypeDto prixToDto(PrixType prix);

    List<PrixType> dtoToPrixList(List<PrixTypeDto> dtoList);

    List<PrixTypeDto> prixListToDtoList(List<PrixType> prixList);
}
