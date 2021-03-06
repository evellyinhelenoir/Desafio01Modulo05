package br.com.zup.DesafioModulo05Conta.conta;

import br.com.zup.DesafioModulo05Conta.enums.Status;
import br.com.zup.DesafioModulo05Conta.enums.Tipo;
import br.com.zup.DesafioModulo05Conta.exceptions.ContaNaoEncontradaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ContaService {
    @Autowired
    private ContaRepository contaRepository;

    public Conta salvarConta (Conta conta){
        verificarVencimento(conta);
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
            throw new ContaNaoEncontradaException("Conta nao encontrada.");
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
    public void verificarVencimento(Conta conta){
        if (conta.getDataVencimento().isBefore(LocalDate.now())){
            conta.setStatus(Status.VENCIDA);
            contaRepository.save(conta);
        }else {
            conta.setStatus(Status.AGUARDANDO);
            contaRepository.save(conta);
        }
    }
    public List<Conta> exibitListaDeContas(Status status, Tipo tipo, Double valor) {
        if(status != null){
            return contaRepository.findAllByStatus(status);
        }
        if(tipo != null){
            return contaRepository.findAllByTipo(tipo);
        }
        if(valor != null){
            return contaRepository.findAllByValorAproximado(valor);
        }

        Iterable<Conta> contas = contaRepository.findAll();
        return (List<Conta>) contas;
    }

}
