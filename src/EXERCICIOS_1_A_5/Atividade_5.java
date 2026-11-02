package EXERCICIOS_1_A_5;

public class Atividade_5 {

        public static void main(String[] args) {

            double media = calcularMedia(8.0, 6.0);

            boolean aprovado = estaAprovado(media);

            mostrarResultado(media, aprovado);
        }

        // Método 1: calcula a média
        public static double calcularMedia(double n1, double n2) {
            return (n1 + n2) / 2;
        }

        // Método 2: verifica se foi aprovado
        public static boolean estaAprovado(double media) {
            return media >= 7;
        }

        // Método 3: mostra o resultado
        public static void mostrarResultado(double media, boolean aprovado) {

            System.out.println("Média: " + media);

            if (aprovado) {
                System.out.println("Situação: APROVADO");
            } else {
                System.out.println("Situação: REPROVADO");
            }
        }
}
