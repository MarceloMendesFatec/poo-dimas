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
  public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;

    public Funcionario(int registro, String nome, String dtAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
    
    abstract public double calcSalBruto();
    
    abstract public double calcDesconto();
    
    abstract public double calcSalLiquido();
    
}
