package com.aluracursos.screemmacht.services;

public interface IConvierteDatos
{
    //Esto es una interfaz de tipo generico por si cambiamos de si es
    //serie o pelicula o podcast

   /**METODO GENERICO*/
   // TODO: ´ESTA ES UNA CLASE GENERICA´
   <T> T obtenerDatos(String json , Class<T> clase);
}
