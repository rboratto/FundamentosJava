package fundamentos;

import java.util.Scanner;

public class Medidas {
    static Scanner entrada = new Scanner(System.in);;
    static int area;

    public static void main(String[] args){
        String opcao;

        System.out.println("Escolha o cálculo desejado");
        System.out.println("(1) Area do quadrado");
        System.out.println("(2) Area do retângulo");
        System.out.println("(3) Area do triângulo");
        System.out.println("(4) Area do círculo");

        opcao = entrada.nextLine();

        switch(opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            default:
                System.out.println("Opção inválida " + opcao);


        }
        if (area > 0) {
            System.out.println("A área é de " + area + "m²");
        }
    }
    public static int calcularAreaDoQuadrado(){

        int lado; //valor do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); //leitura do tamanho do lado
        return lado * lado;
    }
}
