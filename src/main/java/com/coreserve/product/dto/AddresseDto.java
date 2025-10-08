package com.coreserve.product.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddresseDto {

    private Long id;

    private String street;

    private String city;

    private String codePostal;
}
