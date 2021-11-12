package br.com.zup.DesafioModulo05Conta.conta;

import br.com.zup.DesafioModulo05Conta.dtos.ResumoContaDTO;
import br.com.zup.DesafioModulo05Conta.dtos.ResumoEntradaDTO;
import br.com.zup.DesafioModulo05Conta.dtos.ResumoSaidaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

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
    @GetMapping
    public List<ResumoContaDTO> exibirTodasContas(){
        List<ResumoContaDTO> contasDTO = new ArrayList<>();
        for (Conta contas : contaService.exibirTodasContas()){
            ResumoContaDTO resumoContaDTO = modelMapper.map(contas, ResumoContaDTO.class);
            contasDTO.add(resumoContaDTO);
        }
        return contasDTO;
    }
}
