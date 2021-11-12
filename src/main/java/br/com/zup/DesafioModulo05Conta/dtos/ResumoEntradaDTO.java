package br.com.zup.DesafioModulo05Conta.dtos;

import br.com.zup.DesafioModulo05Conta.enums.Tipo;

import java.time.LocalDate;

public class ResumoEntradaDTO {
    private String nome;
    private double valor;
    private Tipo tipo;
    private LocalDate dataVencimento;

    public ResumoEntradaDTO(String nome, double valor, Tipo tipo, LocalDate dataVencimento) {
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
        this.dataVencimento = dataVencimento;
    }

    public ResumoEntradaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
