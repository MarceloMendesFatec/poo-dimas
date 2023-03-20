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
public class Livro {
    private int identificacao;
    private boolean situacao; // true para disponível, false para emprestado
    private double valMultaDiaria;

    public Livro(int identificacao) {
        this.identificacao = identificacao;
        this.situacao = true; // o livro inicia disponível
        this.valMultaDiaria = 2.5; // valor padrão da multa diária
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }

    public boolean getSituacao() {
        return this.situacao;
    }

    public void emprestar() {
        if (this.situacao) {
            this.situacao = false; // marca o livro como emprestado
        } else {
            System.out.println("O livro está emprestado");
        }
    }

    public double devolver(int diasAtraso) {
        if (!this.situacao) {
            this.situacao = true; // marca o livro como disponível
            double multa = diasAtraso * this.valMultaDiaria;
            return multa;
        } else {
            System.out.println("O livro já está disponível");
            return 0;
        }
    }
}


