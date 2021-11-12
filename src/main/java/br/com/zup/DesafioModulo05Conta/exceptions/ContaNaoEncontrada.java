package br.com.zup.DesafioModulo05Conta.exceptions;

public class ContaNaoEncontrada extends RuntimeException{
    public ContaNaoEncontrada(String message) {
        super(message);
    }
}
