package desafios;

import java.util.Scanner;

/**
 * @author RubioAlves
 * Created 12/08/2021 at 11:25
 */

public class Desafio2 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int T, menor = 21, posMenor = 0;
        for (int i = 1;i <= N;i++) {
            T = leitor.nextInt();
            if (T < menor) {
                menor = T;
                posMenor = i;
            }
        }
        System.out.println(posMenor);
    }
}
