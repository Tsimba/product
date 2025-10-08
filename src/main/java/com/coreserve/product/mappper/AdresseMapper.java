package com.coreserve.product.mappper;



import com.coreserve.product.dto.AddresseDto;
import com.coreserve.product.modele.Addresse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AdresseMapper {

    AdresseMapper INSTANCE = Mappers.getMapper(AdresseMapper.class);

    Addresse dtoToAddress(AddresseDto dto);

    AddresseDto fournisseurToDto(Addresse fournisseur);

    List<Addresse> dtoToFournisseurList(List<AddresseDto> dtoList);

    List<AddresseDto> fournisseurListToDtoList(List<Addresse> fournisseurList);
}
