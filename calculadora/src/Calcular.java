import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double valor1;
        double valor2;
        double resultado;

        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o número 1");
                    valor1 = scanner.nextDouble();
                    System.out.println("Digite o número 2");
                    valor2 = scanner.nextDouble();

                    resultado = valor1 + valor2;
                    System.out.println("O resultado da soma é " + resultado);
                    break;

                case 2:
                    System.out.println("Digite o número 1");
                    valor1 = scanner.nextDouble();
                    System.out.println("Digite o número 2");
                    valor2 = scanner.nextDouble();

                    resultado = valor1 - valor2;
                    System.out.println("O resultado da subtração é " + resultado);
                    break;

                case 3:
                    System.out.println("Digite o número 1");
                    valor1 = scanner.nextDouble();
                    System.out.println("Digite o número 2");
                    valor2 = scanner.nextDouble();

                    resultado = valor1 * valor2;
                    System.out.println("O resultado da multiplicação é " + resultado);
                    break;

                case 4:
                    System.out.println("Digite o número 1");
                    valor1 = scanner.nextDouble();
                    System.out.println("Digite o número 2");
                    valor2 = scanner.nextDouble();

                    if (valor2 != 0) {
                        resultado = valor1 / valor2;
                        double resto = valor1 % valor2;
                        System.out.println("Resultado: " + resultado);
                        System.out.println("Resto: " + resto);
                    } else {
                        System.out.println("Divisão por zero não permitida");
                    }
                    break;

                case 5:
                    System.out.println("Digite o número 1");
                    valor1 = scanner.nextDouble();
                    System.out.println("Digite o número 2");
                    valor2 = scanner.nextDouble();
                    double potencia = Math.pow(valor1, valor2);

                    System.out.println("O resultado da potenciação é " + potencia);
                    break;

                case 6:
                    System.out.println("Saindooooooo");
                    continuar = false;
                    break;

                default:
                    System.out.println("Error");

            }
        }
        scanner.close();
    }
}
