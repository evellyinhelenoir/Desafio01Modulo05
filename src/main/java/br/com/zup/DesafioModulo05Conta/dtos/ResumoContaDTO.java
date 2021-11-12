package br.com.zup.DesafioModulo05Conta.dtos;

import br.com.zup.DesafioModulo05Conta.enums.Status;
import br.com.zup.DesafioModulo05Conta.enums.Tipo;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ResumoContaDTO {
    private String nome;
    private double valor;
    private Status status;
    private int id;

    public ResumoContaDTO() {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
