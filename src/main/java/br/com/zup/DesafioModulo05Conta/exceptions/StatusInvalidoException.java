package br.com.zup.DesafioModulo05Conta.exceptions;

public class StatusInvalidoException extends RuntimeException{
    public StatusInvalidoException(String message) {
        super(message);
    }
}
