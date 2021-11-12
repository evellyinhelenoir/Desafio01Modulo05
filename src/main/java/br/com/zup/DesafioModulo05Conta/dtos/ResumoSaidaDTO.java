package br.com.zup.DesafioModulo05Conta.dtos;

import br.com.zup.DesafioModulo05Conta.enums.Status;
import br.com.zup.DesafioModulo05Conta.enums.Tipo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ResumoSaidaDTO {
    private String nome;
    private double valor;
    private Tipo tipo;
    private LocalDate dataVencimento;
    private LocalDateTime dataPagamento;
    private Status status;

    public ResumoSaidaDTO() {
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

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
