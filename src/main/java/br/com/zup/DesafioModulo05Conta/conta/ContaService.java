package br.com.zup.DesafioModulo05Conta.conta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {
    @Autowired
    private ContaRepository contaRepository;

    public Conta salvarConta (Conta conta){

        return contaRepository.save(conta);
    }
}
