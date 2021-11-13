package br.com.zup.DesafioModulo05Conta.exceptions;

public class ContaNaoEncontradaException extends RuntimeException{
    public ContaNaoEncontradaException(String message) {
        super(message);
    }
}
