package br.com.zup.DesafioModulo05Conta.conta;

import br.com.zup.DesafioModulo05Conta.dtos.*;
import br.com.zup.DesafioModulo05Conta.enums.Status;
import br.com.zup.DesafioModulo05Conta.enums.Tipo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerContaPorId(@PathVariable int id){
        contaService.removerContaPorId(id);
    }
    @PutMapping("/{id}")
    public ContaDTO atualizarContas (@RequestBody ResumoStatusDTO resumoStatusDTO, @PathVariable int id){
        return modelMapper.map(contaService.atualizarContaPorId(id, resumoStatusDTO.getStatus()), ContaDTO.class);
    }
    @GetMapping
    public List<ResumoContaDTO> exibirListaDeContas(@RequestParam(required = false) Status status,
                                                    @RequestParam(required = false) Tipo tipo,
                                                    @RequestParam(required = false) Double valor){
        List<ResumoContaDTO> resumoDTOS = new ArrayList<>();
        for (Conta contas : contaService.exibitListaDeContas(status, tipo, valor)){
            ResumoContaDTO resumo = modelMapper.map(contas, ResumoContaDTO.class);
            resumoDTOS.add(resumo);
        }
        return resumoDTOS;
    }
}
