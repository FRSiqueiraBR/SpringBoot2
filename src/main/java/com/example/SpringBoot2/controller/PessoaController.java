package com.example.SpringBoot2.controller;

import com.example.SpringBoot2.document.Pessoa;
import com.example.SpringBoot2.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa){
        return this.pessoaService.criarPessoa(pessoa);
    }

    @GetMapping("/{id}")
    public Pessoa recuperaPessoa(@PathVariable String id) {
        return this.pessoaService.recuperaPessoa(id);
    }

}
