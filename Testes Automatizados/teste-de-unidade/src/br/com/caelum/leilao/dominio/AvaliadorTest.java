package br.com.caelum.leilao.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AvaliadorTest {

    private static Avaliador avaliador;

    @BeforeAll
    public static void criarAvaliador() {
        avaliador = new Avaliador();
    }

    @Test
    public void testeAvaliador() {

        Leilao leilao = new Leilao("Ferrari F50");

        List<Lance> lances = new ArrayList<>();

        lances.add(new Lance(new Usuario("Roger"),2500.0));
        lances.add(new Lance(new Usuario("Feder"),4500.0));
        lances.add(new Lance(new Usuario("Romario"),1500.0));
        lances.add(new Lance(new Usuario("Ronaldo"),8500.0));

        avaliador.avaliar(lances);

        Double maiorEsperado = 8500.0;
        Double menorEsperado = 1500.0;
        Double medioEsperado = 4250.0;

        assertEquals(menorEsperado, avaliador.getMenorLance(), 0.0001);
        assertEquals(maiorEsperado, avaliador.getMaiorLance(), 0.0001);
        assertEquals(medioEsperado, avaliador.getLanceMedio(), 0.0001);
    }

    @Test
    public void tresMaioresTestes() {
        Leilao leilao = new Leilao("Ferrari F50");

        List<Lance> lances = new ArrayList<>();

        Lance roger = new Lance(new Usuario("Roger"), 2500.0);
        lances.add(roger);
        Lance feder = new Lance(new Usuario("Feder"), 4500.0);
        lances.add(feder);
        Lance romario = new Lance(new Usuario("Romario"), 1500.0);
        lances.add(romario);
        Lance ronaldo = new Lance(new Usuario("Ronaldo"), 8500.0);
        lances.add(ronaldo);

        avaliador.avaliar(lances);

        assertEquals(3, avaliador.getTresMaiores().size());
    }

    @Test
    public void leilaoSemLance() {
        Leilao leilao = new Leilao("Teste");
        List<Lance> lances= new ArrayList<>();
        assertThrows(Exception.class, () -> {avaliador.avaliar(lances);});

    }
}
