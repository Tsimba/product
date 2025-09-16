package com.coreserve.product.mappper;



import com.coreserve.product.dto.ConditionnementDto;
import com.coreserve.product.modele.Conditionnement;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ConditionnementMapper {

    ConditionnementMapper INSTANCE = Mappers.getMapper(ConditionnementMapper.class);


    Conditionnement dtoToConditionnement(ConditionnementDto dto);

    ConditionnementDto conditionnementToDto(Conditionnement conditionnement);

    List<Conditionnement> dtoToConditionnementList(List<ConditionnementDto> dtoList);

    List<ConditionnementDto> conditionnementListToDtoList(List<Conditionnement> conditionnementList);
}
