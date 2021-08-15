package desafios;

import java.util.Scanner;
/**
 * @author RubioAlves
 * Created 12/08/2021 at 11:26
 */
public class Desafio3 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 1; i <= N;i++) {
            if (N%i == 0) System.out.println(i);
        }
    }

}
