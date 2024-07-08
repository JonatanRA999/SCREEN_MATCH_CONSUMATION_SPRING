package com.aluracursos.screemmacht.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI
{
    //Metodo que recibe la URL de La API y devuelve el Body[cuerpo] de la respuesta en un String
    public String obtenerDatos(String url)
    {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = null;

        try
        {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());

        }catch (IOException | InterruptedException e)
        {
            throw new RuntimeException();
        }

        return response.body();
    }
}
