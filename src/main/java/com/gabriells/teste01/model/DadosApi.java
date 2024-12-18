package com.gabriells.teste01.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosApi(@JsonAlias("cep") String cep,
                       @JsonAlias("logradouro") String rua,
                       @JsonAlias("bairro") String bairro,
                       @JsonAlias("localidade") String cidade,
                       @JsonAlias("estado") String estado)
   {
}
