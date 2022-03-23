package br.com.sorts.bubble_sort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class BubbleSortApplication {

//public static void main(String[] args) {
//SpringApplication.run(BubbleSortApplication.class, args);

//	}

//}

public class BubbleSortApplication {

  public static void main(String[] args) throws InterruptedException {
    boolean houveTroca;
    int contadorMudanca, i, x, aux;
    int[] numero = {
      8590,
      506,
      45,
      1022,
      1,
      84,
      4,
      999,
      22,
      46,
      -4,
      -1045,
      16,
      16184,
      4,
    };

    //Ordenação do vetor via bubble sort:
    contadorMudanca = 0;
    houveTroca = true;
    while (houveTroca == true) {
      houveTroca = false;
      for (x = 0; x < numero.length - 1; x++) {
        if (numero[x] > numero[x + 1]) {
          aux = numero[x];
          numero[x] = numero[x + 1];
          numero[x + 1] = aux;
          houveTroca = true;
          contadorMudanca++;

          //Exibindo o status pós-troca na tela:
          limpaTela();
          System.out.println(contadorMudanca + "ª mudança:");
          System.out.println();

          for (i = 0; i < numero.length; i++) {
            /*
             * Trabalhando com o índice:
             * X é o índice do menor número (após a troca);
             * X + 1 é o úndice do maior número (após a troca);
             * Portanto:
             */
            if (i == x) {
              System.out.println(numero[i] + "<--- Menor valor da alteração.");
            } else if (i == (x + 1)) {
              System.out.println(numero[i] + "<--- Maior valor da alteração.");
            } else {
              System.out.println(numero[i]);
            }
          }
          dorme();
        }
      }
    }

    //E então, mostrando o resultado final:
    limpaTela();
    System.out.println(
      "Depois de " + contadorMudanca + " alterações, eis o vetor ordenado:"
    );
    System.out.println();
    for (i = 0; i < numero.length; i++) {
      System.out.println(i + 1 + "º número: " + numero[i]);
    }
  }

  //Métodos Úteis
  public static void limpaTela() {
    for (int i = 0; i < 30; ++i) System.out.println();
  }

  public static void dorme() throws InterruptedException {
    Thread.sleep(700);
  }
}
