package br.com.zup.DesafioModulo05Conta.dtos;

import br.com.zup.DesafioModulo05Conta.enums.Status;
import br.com.zup.DesafioModulo05Conta.enums.Tipo;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ContaDTO {
    private String nome;
    private double valor;
    private LocalDate dataVencimento;
    private LocalDateTime dataPagamento;
    private Status status;
    private Tipo tipo;
    private int id;

    public ContaDTO() {
    }

    public ContaDTO(String nome, double valor, LocalDate dataVencimento, LocalDateTime dataPagamento, Status status, Tipo tipo, int id) {
        this.nome = nome;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.status = status;
        this.tipo = tipo;
        this.id = id;
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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
