package com.aluracursos.screemmacht;

import com.aluracursos.screemmacht.Main.EjStreams;
import com.aluracursos.screemmacht.Main.Main;
import com.aluracursos.screemmacht.model.DatosEpisodio;
import com.aluracursos.screemmacht.model.DatosSerie;
import com.aluracursos.screemmacht.model.DatosTemporadas;
import com.aluracursos.screemmacht.services.ConsumoAPI;
import com.aluracursos.screemmacht.services.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreemmachtApplication implements CommandLineRunner {

	public static void main(String[] args)
	{
		SpringApplication.run(ScreemmachtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
        //System.out.println(((Object) json).getClass().getName()); mirar el tipo de variable
        Main main = new Main();
        main.muestraElMenu();

	}
}
