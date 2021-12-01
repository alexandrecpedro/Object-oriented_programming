package Aula19.Armazem;

import Aula19.Industria.EmpregadoFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade de produtos a serem armazenados: ");
        int quantidadeProduto = scan.nextInt();
        scan.nextLine();
        Armazem armazem = new Armazem();

        for (int i = 0; i < quantidadeProduto; i++) {
            System.out.println("Categoria do produto: \n1-Caixa \n2-Bola \0-Sair");
            int categoriaProd = scan.nextInt();
            scan.nextLine();
            switch (categoriaProd) {
                case 0:
                    break;
                case 1:
                    System.out.println("Dimensões da Caixa");
                    System.out.println("Comprimento: ");
                    double comprimento = scan.nextDouble();
                    System.out.println("Altura: ");
                    double altura = scan.nextDouble();
                    System.out.println("Largura: ");
                    double largura = scan.nextDouble();
                    break;
                case 2:
                    System.out.println("Raio da Bola");
                    double raio = scan.nextDouble();
                    break;
                default:
                    System.out.println("Entre com uma categoria válida!");
            }
        }
        scan.close();
    }
}
