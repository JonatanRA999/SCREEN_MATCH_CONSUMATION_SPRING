package com.aluracursos.screemmacht.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//ignorará las propiedades del JSON que no pongamos para mapear
//en este caso solo reconocera las tres que pusimos las demas serán ignoradas

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosSerie(
       @JsonAlias("Title") String title ,
       @JsonAlias("totalSeasons") Integer totalDeTemporadas,
       @JsonAlias("imdbRating") String evaluaciones ,
       @JsonAlias("Poster") String poster,
       @JsonAlias("Genre") String genero,
       @JsonAlias("Actors") String actores,
       @JsonAlias("Plot") String sinopsis
)
{

}
