/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author marcelo
 */
public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncionarioHorista(int registro, String nome, String dtAdmissao, double valHorTrab) {
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }

    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }

    @Override
     public double calcSalBruto(){
         return(valHorTrab * qtdeHorTrab);
     };
     
    
    @Override
     public double calcDesconto(){
         return ( 0.1 * calcSalBruto());
     };
    
    @Override
     public double calcSalLiquido(){
         return (calcSalBruto() - calcDesconto());
     };
    
}
