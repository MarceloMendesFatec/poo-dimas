
import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class Aplication {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Aluno   objAluno = new Aluno();
        int option ;
        int ra;
        double prv1,prv2,trab1,trab2;

        System.out.println("Digite o Registro academico do aluno");
        ra = scanner.nextInt();
        objAluno.setRA(ra);
        
        System.out.println("Digite a nota da primeira prova");
        prv1 = scanner.nextDouble();
        objAluno.setNtPrv1(prv1);
        
        System.out.println("Digite a nota da segunda prova");
        prv2 = scanner.nextDouble();
        objAluno.setNtPrv2(prv2);
        
        System.out.println("Digite a nota do primeiro trabalho");
        trab1 = scanner.nextDouble();
        objAluno.setNtTrab1(trab1);
        
        System.out.println("Digite a nota do segundo trabalho");
        trab2 = scanner.nextDouble();
        objAluno.setNtTrab2(trab2);
    
        
        do {
            
            System.out.println("1-Exibir Nota das Provas/Trabalhos");
            System.out.println("2.Exibir Media dos Trabalhos/Provas");
            System.out.println("3-Exibir Media Final");
            System.out.println("4- Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Nota da prova 1 : " + objAluno.getNtPrv1());
                    System.out.println("Nota da prova 2 : " + objAluno.getNtPrv2());
                    System.out.println("Nota do trabalho 1 : " + objAluno.getNtTrab1());
                    System.out.println("Nota do trabalho 2 : " + objAluno.getNtTrab2());
                    
                    break;
                case 2:
                    System.out.println("Media dos trabalhos: " + objAluno.calcMediaTrab());
                    System.out.println("Media das provas: " + objAluno.calcMediaProva());
                    break;
                case 3:
                    System.out.println("Media final: " + objAluno.calcMediaFinal());
                    break;
                case 4:
                    System.out.println("Saindo da aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (option != 4);
    }
}
    
    

