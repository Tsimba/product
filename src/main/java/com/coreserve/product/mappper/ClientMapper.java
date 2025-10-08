package com.coreserve.product.mappper;



import com.coreserve.product.dto.ClientDto;
import com.coreserve.product.modele.Client;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel="spring",
        uses = {
                AdresseMapper.class,
        },
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClientMapper {

    Client dtoToArticle(ClientDto dto);

    ClientDto articleToDto(Client article);

    List<Client> dtoToArticleList(List<ClientDto> dtoList);

    List<ClientDto> articleListToDtoList(List<Client> articleList);
}
