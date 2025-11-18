
import Arrays.Array;
import Produto.Esfihas;
import Produto.PrincipalProdutos;

import java.util.ArrayList;

public class AnhembiEsfiha {

    public static void main(String[] args) {
        System.out.println("Programa AnhembiEsfiha iniciado!");

        Array Lista = new Array(3);

        int contador = 0;

        while (contador < 5) {
            contador++;
            PrincipalProdutos Produto1 = new Esfihas("André", "De carne", "Fritas", 20.0, true, "Carne" );
            Produto1.setId(contador);
            Lista.Inserir(Produto1);
        }

        Lista.Exibir();
        System.out.println(Lista.RemoverPorID(Lista.PegarIndexPeloID(2)));
        Lista.Exibir();
    }
}
