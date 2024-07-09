package com.aluracursos.conversormonedas;
//Record para las variables de la api que se vana  usar
public record Divisa(String base_code,
                     String target_code,
                     double conversion_rate) {

}