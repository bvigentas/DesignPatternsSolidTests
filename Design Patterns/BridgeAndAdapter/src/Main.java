/**
 * Design Pattern BRIDGE
 * É uma ponte que esconde a complexidade da chamada ou execução de determinado metodo de uma api, ou outro sistema
 */

import java.net.URL;

/**
 * Design Pattern Adapter
 * Adapta uma parte do sistema, escondendo a complexidade de um código para o desenvolvedor.
 * Utilizado muito quando se está refatorando um sistema. Enquanto não se tem uma parte pronta, cria se um adapter
 * que chama a rotina do antigo sistema.
 */

public class Main {

    public static void main(String[] args) {
        Mapa mapaGoogle = new GoogleMaps();
        mapaGoogle.devolveMapa("");

        Mapa mapaLink = new LinkMaps();
        mapaLink.devolveMapa("");
    }
}
