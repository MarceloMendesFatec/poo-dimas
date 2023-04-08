
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista (1010,
                                                             "Carlos Felino",
                                                             "04/05/1996",
                                                             18.90);
        
        funcHor.setQtdeHorTrab(44);
        
        System.out.println("Salario Bruto   =>   " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto        =>   " + df.format(funcHor.calcDesconto()));
        System.out.println("Salario Liquido =>   " + df.format(funcHor.calcSalLiquido()));
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(1015,
                                                                  "Ana Catarina",
                                                                  "23/12/1998",
                                                                  1200.00) ;
      
        funcMen.setNumSalMin(3);
        
        
        System.out.println("\n\nSalario Bruto   =>   " + df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto        =>   " + df.format(funcMen.calcDesconto()));
        System.out.println("Salario Liquido =>   " + df.format(funcMen.calcSalLiquido()));
        
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(1020,
                                                                      "Maria Joaquina",
                                                                      "04/09/1999",
                                                                      0.1);
        
        funcCom.setSalBase(2000);
        funcCom.addVendas(6000);
        
        System.out.println("\n\nSalario Bruto   =>   " + df.format(funcCom.calcSalBruto()));
        System.out.println("Desconto        =>   " + df.format(funcCom.calcDesconto()));
        System.out.println("Salario Liquido =>   " + df.format(funcCom.calcSalLiquido()));
        
        
        
        System.out.println("\nTotal de vendas  =>   " + df.format(funcCom.getTotalVendas()));
        System.out.println("Sua comissao =>   " + df.format(funcCom.getTaxaComissao()));
        System.out.println("Gratificacao =>    "  + df.format(funcCom.calcGratificacao()));
        System.out.println("Salario Liquido =>   " + df.format(funcCom.calcSalLiquido()));
    }
    
}
