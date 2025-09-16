package com.coreserve.product.mappper;


import com.coreserve.product.dto.PrixDto;
import com.coreserve.product.modele.Prix;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PrixMapper {
    Prix dtoToPrix(PrixDto dto);

    PrixDto prixToDto(Prix prix);

    List<Prix> dtoToPrixList(List<PrixDto> dtoList);

    List<PrixDto> prixListToDtoList(List<Prix> prixList);
}
