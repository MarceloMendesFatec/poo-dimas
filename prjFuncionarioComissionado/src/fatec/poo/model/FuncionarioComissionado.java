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
public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdmissao,double taxaComissao ) {
        super(registro, nome, dtAdmissao);
        this.taxaComissao = taxaComissao;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getSalBase() {
        return salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void addVendas (double totalVendas) {
        this.totalVendas += totalVendas;
    }
    
    public double calcSalBruto(){
        return (salBase + taxaComissao * totalVendas);
    }
    
    public double calcSalLiquido(){
        return (calcSalBruto() - calcDesconto() + calcGratificacao() );
    }
    
    public double calcDesconto(){
        return(calcSalBruto() * 0.1 );
    }
    
    public double calcGratificacao(){
        if(totalVendas < 5000){
            return 0;
        }else if (totalVendas > 5000 && totalVendas < 10000){
            return (calcSalBruto() * 0.03);
        }else{
            return(calcSalBruto() * 0.05);
        }
    }
}
