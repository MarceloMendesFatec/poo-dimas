/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */
import fatec.poo.model.Livro;
import java.util.Scanner;


public class Aplic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro livro = new Livro(1234);

        while (true) {
            System.out.println("1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Situação do livro: " + (livro.getSituacao() ? "disponível" : "emprestado"));
                    break;
                case 2:
                    livro.emprestar();
                    break;
                case 3:
                    System.out.print("Quantos dias de atraso? ");
                    int diasAtraso = sc.nextInt();
                    double multa = livro.devolver(diasAtraso);
                    if (multa > 0) {
                        System.out.println("Valor a ser pago pela entrega em atraso: R$ " + multa);
                    }
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}


