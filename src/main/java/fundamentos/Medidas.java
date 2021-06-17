package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {
    static Scanner entrada = new Scanner(System.in);;
    static double area;


    public static void main(String[] args){
        String opcao = " ";

        do {

            System.out.println("(1) Area do quadrado");
            System.out.println("(2) Area do retângulo");
            System.out.println("(3) Area do triângulo");
            System.out.println("(4) Area do círculo");
            System.out.println("(5) Tabuada");
            System.out.println("(6) Fibonacci");
            System.out.println("(7) Contagem Regressiva");
            System.out.println("(S) Sair");

            opcao = entrada.nextLine();

            switch (opcao) {
                case "1":
                    area = calcularAreaDoQuadrado();
                    break;
                case "2":
                    area = calcularAreaDoRetangulo();
                    break;
                case "3":
                    area = calcularAreaDoTriangulo();
                    break;
                case "4":
                    area = calcularAreaDoCirculo();
                    break;
                case "5":
                    tabuada();
                    break;
                case "6":
                    fibonacci();
                    break;
                case "7":
                    contagemRegressiva();
                    break;
                case "S":
                case "s":
                    System.out.println("Obrigado por usar");
                    break;
                default:
                    System.out.println("Opção inválida " + opcao);
                    main(args);


            }
            if (area > 0) {
                System.out.println("A área é de " + area + "m²");
            }
        }
        while (!opcao.toUpperCase().equals("S"));
    }
    public static int calcularAreaDoQuadrado(){

        int lado; //valor do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); //leitura do tamanho do lado


        ///Desenhar o quadrado
        for (int linha = 1; linha <= lado; linha+=2){
            for(int coluna = 1; coluna <= lado; coluna++){
                System.out.print("▓");
            }
            System.out.println("");
        }

        return lado * lado;
    }
    public static int calcularAreaDoRetangulo(){

        int base; //valor da base do retângulo
        int altura;

        System.out.println("Digite o tamanho da base: ");
        base = entrada.nextInt(); //leitura do tamanho da base
        altura = entrada.nextInt(); //leitura do tamanho da altura

        return base * altura;
    }

    public static int calcularAreaDoTriangulo(){

        int base;
        int altura;

        System.out.println("Digite o tamanho da base: ");
        base = entrada.nextInt(); //leitura do tamanho da base

        System.out.println("Digite o tamanho da altura: ");
        altura = entrada.nextInt(); //leitura do tamanho da altura

        return (base * altura) / 2;
    }
    public static double calcularAreaDoCirculo(){

        int raio;

        System.out.println("Digite o raio do círculo: ");
        raio = entrada.nextInt(); //leitura do tamanho da base

        return (3.14 * (raio * raio));
    }
    public static void tabuada() {
        System.out.println("Você quer calcular a tabuada de qual número");
        byte numero = entrada.nextByte();

        for (byte tab = 1; tab <=10; tab++){
            System.out.print(numero * tab + " ");
        }
    }
    public static void fibonacci() {
        System.out.println("Você quer quantos números na sequência:");
        byte numero = entrada.nextByte();
        int num1 = 0;
        int num2 = 0;
        int fib =  0;

        switch(numero) {
            case 0:
                System.out.println("A sequencia está vazia");
                break;
            case 1:
                System.out.println("Sequência de Finonacci: 1");
                break;
            default:
                num1 = 0;
                num2 = 1;

                for (byte i = 2; i <= numero + 1; i++){
                    fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;
                }
        }

    }
    public static void contagemRegressiva(){

        System.out.print("Escolha o número para contagem regressiva:");
        int numero = entrada.nextInt();

        System.out.print("Diminuindo de quantos em quantos números por vez?");
        int decrescimo = entrada.nextInt();

        for (int i = numero; i >= 1 ; i-=decrescimo){
            System.out.print(i + " ");
        }
    }

}
