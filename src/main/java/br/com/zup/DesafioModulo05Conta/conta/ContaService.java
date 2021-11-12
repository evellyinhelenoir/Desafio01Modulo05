package br.com.zup.DesafioModulo05Conta.conta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {
    @Autowired
    private ContaRepository contaRepository;

    public Conta salvarConta (Conta conta){

        return contaRepository.save(conta);
    }
    public List<Conta> exibirTodasContas(){
        List<Conta> contas = (List<Conta>) contaRepository.findAll();
        return contas;
    }
    public void removerContaPorId (int id){
        boolean contaASerRemovida = false;
        Conta contaRemovida = null;
        for (Conta conta : contaRepository.findAll()){
            if (conta.getId() == id){
                contaASerRemovida = true;
                contaRemovida = conta;
            }
        }
        if (contaASerRemovida){
            contaRepository.delete(contaRemovida);
        }
    }
}
