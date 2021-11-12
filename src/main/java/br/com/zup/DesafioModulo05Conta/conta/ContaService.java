package br.com.zup.DesafioModulo05Conta.conta;

import br.com.zup.DesafioModulo05Conta.enums.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
    public Conta localizarContaPorId(int id){
        Optional<Conta> contaLocalizada = contaRepository.findById(id);
        if (contaLocalizada.isEmpty()){
            throw new RuntimeException("ID não localizado.");
        }
        return contaLocalizada.get();
    }
    public Conta atualizarContaPorId(int id, Status status){
        Conta conta = localizarContaPorId(id);
        conta.setDataPagamento(LocalDateTime.now());
        conta.setStatus(status);
        contaRepository.save(conta);
        return conta;
    }
}
