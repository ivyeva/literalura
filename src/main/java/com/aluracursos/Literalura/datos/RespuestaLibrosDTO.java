package com.aluracursos.Literalura.datos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RespuestaLibrosDTO {

    @JsonProperty("results")
    private List<com.aluracursos.Literalura.datos.LibroDTO> libros;

    public List<com.aluracursos.Literalura.datos.LibroDTO> getLibros() {
        return libros;
    }

    public void setLibros(List<com.aluracursos.Literalura.datos.LibroDTO> libros) {
        this.libros = libros;
    }
}