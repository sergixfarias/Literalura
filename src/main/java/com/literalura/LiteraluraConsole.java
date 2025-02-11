package com.literalura;
import com.literalura.Libreria.Libreria;
import com.literalura.repository.iAutorRepository;
import com.literalura.repository.iLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraConsole implements CommandLineRunner {
    @Autowired
    private iLibroRepository libroRepository;
    @Autowired
    private iAutorRepository autorRepository;

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraConsole.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Libreria libreria = new Libreria(libroRepository, autorRepository);
        libreria.consumo();
    }
}