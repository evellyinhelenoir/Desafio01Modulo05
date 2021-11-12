package br.com.zup.DesafioModulo05Conta.dtos;

import br.com.zup.DesafioModulo05Conta.enums.Status;

public class ResumoStatusDTO {
    private Status status;

    public ResumoStatusDTO(Status status) {
        this.status = status;
    }

    public ResumoStatusDTO() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
