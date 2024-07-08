package com.aluracursos.screemmacht.Main;

import java.util.Arrays;
import java.util.List;

public class EjStreams {

    public void muestraEjem(){
        List<String> nombres = Arrays.asList("hola", "perro", "como estas");

        nombres.stream()
                .skip(1)
                .sorted() //organiza la lista
                .forEach(System.out::println); // recorrido de la lista
    }
}
