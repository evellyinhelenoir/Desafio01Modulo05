package br.com.zup.DesafioModulo05Conta.exceptions;

public class ContaExistenteException extends RuntimeException{
    public ContaExistenteException(String message) {
        super(message);
    }
}
