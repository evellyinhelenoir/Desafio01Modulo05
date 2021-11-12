package br.com.zup.DesafioModulo05Conta.conta;

import br.com.zup.DesafioModulo05Conta.enums.Status;
import br.com.zup.DesafioModulo05Conta.enums.Tipo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContaRepository extends CrudRepository<Conta, Integer> {
    List<Conta> findAllByStatus(Status status);
    List<Conta> findAllByTitpo(Tipo tipo);
    List<Conta> findAllByValorAproximado(double valor);
}