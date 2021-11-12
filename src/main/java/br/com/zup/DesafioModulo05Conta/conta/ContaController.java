package br.com.zup.DesafioModulo05Conta.conta;

import br.com.zup.DesafioModulo05Conta.dtos.ResumoEntradaDTO;
import br.com.zup.DesafioModulo05Conta.dtos.ResumoSaidaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    private ContaService contaService;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResumoSaidaDTO realizarCadastroConta(@RequestBody @Valid ResumoEntradaDTO resumoEntradaDTO){
        Conta conta = modelMapper.map(resumoEntradaDTO, Conta.class);
        return modelMapper.map(contaService.salvarConta(conta), ResumoSaidaDTO.class);
    }
}
