package EXERCICIOS_1_A_5;

public class Atividade_3 {
    public static void mostrarDobro(int numero) {
        System.out.println("O dobro de " + numero + " é " + (numero * 2));
    }

    public static void mostrarSoma(int a, int b) {
        System.out.println("A soma de " + a + " e " + b + " é " + (a + b));
    }

    public static void mostrarMaior(int a, int b) {
        if (a > b) {
            System.out.println("O maior numero é: " + a);
        } else if (b > a) {
            System.out.println("O maior numero é: " + b);
        } else {
            System.out.println("Os numeros são iguais.");
        }
    }

    public static void main(String[] args) {
        mostrarDobro(8);
        mostrarSoma(10, 5);
        mostrarMaior(20, 15);
    }
}
