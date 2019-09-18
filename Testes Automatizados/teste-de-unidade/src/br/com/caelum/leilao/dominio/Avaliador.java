package br.com.caelum.leilao.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Avaliador {

    private Double maiorLance = Double.MIN_VALUE;
    private Double menorLance = Double.MAX_VALUE;
    private Double lanceMedio;
    private List<Lance> maiores;

    public void avaliar(List<Lance> lances) {
        Double valorTotal = 0.0;
        for (Lance lance :
                lances) {
            if (lance.getValor() > maiorLance) {
                maiorLance = lance.getValor();
            }

            if (lance.getValor() < menorLance) {
                menorLance = lance.getValor();
            }
            valorTotal += lance.getValor();
        }

        lanceMedio = valorTotal / lances.size();

        maiores = new ArrayList<>(lances);
        Collections.sort(maiores, new Comparator<Lance>() {
            @Override
            public int compare(Lance o1, Lance o2) {
                if (o1.getValor() > o2.getValor()) return 1;
                if (o1.getValor() < o2.getValor()) return -1;
                return 0;
            }
        });
        maiores = maiores.subList(0, maiores.size() > 3 ? 3 : maiores.size());
    }

    public List<Lance> getTresMaiores() {
        return maiores;
    }

    public Double getMaiorLance() {
        return maiorLance;
    }

    public Double getMenorLance() {
        return menorLance;
    }

    public Double getLanceMedio() {
        return lanceMedio;
    }
}
