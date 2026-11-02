package EXERCICIOS_1_A_5;

public class Atividade_4 {

        public static void main(String[] args) {

            int resultado = calcularQuadrado(5);

            System.out.println("Resultado: " + resultado);

            int triplo = calcularTriplo(5);

            System.out.println("Triplo: " + triplo);
        }

        public static int calcularQuadrado(int numero) {
            return numero * numero;
        }

        public static int calcularTriplo(int numero) {
            return numero * 3;
        }
}
