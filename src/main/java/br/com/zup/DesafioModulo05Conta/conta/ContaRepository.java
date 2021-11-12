package br.com.zup.DesafioModulo05Conta.conta;

import org.springframework.data.repository.CrudRepository;

public interface ContaRepository extends CrudRepository<Conta, Integer> {
}