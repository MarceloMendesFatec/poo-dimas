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
public class FuncionarioMensalista extends Funcionario{
    private double valSalMin;
    private double numSalMin;

    public FuncionarioMensalista( int registro, String nome, String dtAdmissao, double valSalMin) {
        super(registro, nome, dtAdmissao);
        this.valSalMin = valSalMin;
    }

    public void setNumSalMin(double numSalMin) {
        this.numSalMin = numSalMin;
    }
    
    
    @Override
    public double calcSalBruto(){
        return (valSalMin * numSalMin);
    };

    @Override
    public double calcDesconto() {
       return (calcSalBruto() * 0.1 ); 
    }

    @Override
    public double calcSalLiquido() {
       return ( calcSalBruto() - calcDesconto()); 
    }
    
}
