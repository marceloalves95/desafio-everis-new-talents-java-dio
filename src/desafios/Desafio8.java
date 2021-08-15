package desafios;

import java.util.Scanner;

/**
 * @author RubioAlves
 * Created 12/08/2021 at 11:26
 */
public class Desafio8 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int casaComprado = 0;
        int casaSobrando = 0;
        int trabComprado = 0;
        int trabSobrando = 0;
        String[] linha;
        String ida, volta;

        leitor.nextLine();

        for (int i = 0; i < N; ++i) {
            linha = leitor.nextLine().split(" ");
            ida = linha[0];
            volta = linha[1];

            if (ida.equals("chuva")) {
                if (casaSobrando > 0) {
                    --casaSobrando;
                } else {
                    casaComprado++;
                }
                trabSobrando++;
            }

            if (volta.equals("chuva")) {
                if (trabSobrando > 0) {
                    --trabSobrando;
                } else {
                    trabComprado++;
                }
                casaSobrando++;
            }
        }
        System.out.println(casaComprado + " " + trabComprado);
    }

}
