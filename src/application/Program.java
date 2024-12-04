package application;

import entities.Dados;
import entities.Order;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao cadastradas? ");
        int n = sc.nextInt();
        Dados[] vect = new Dados[n];
        sc.nextLine();

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Sexo: ");
            String sexo = sc.nextLine();
            vect[i] = new Dados(name, sexo);
        }
        Arrays.sort(vect, new Order() {});

        System.out.println("Pessoas ordenadas por sexo: ");
        for (Dados p : vect){
            System.out.println(p);
        }
    }
}
