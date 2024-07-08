package com.aluracursos.screemmacht.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
// si no ignora las demas propiedades que no va a mapiar
// mostrará una Exception en consola , esto es porque en la clase solo se esta mapiando 2 propiedades
//mientras que la biblioteca Json recibe todas las propiedades que le envia la api y por lo tanto
// intentara sobreescribirlas en la clase DTO

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosTemporadas(
      @JsonAlias("Season")  Integer numeroDeSesion ,
      @JsonAlias("Episodes")  List<DatosEpisodio> episodioList
        )
{
}
