package com.example.SpringBoot2.service.impl;


import com.example.SpringBoot2.document.Pessoa;
import com.example.SpringBoot2.exception.PessoaNotFoundException;
import com.example.SpringBoot2.repository.PessoaRepository;
import com.example.SpringBoot2.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public Pessoa criarPessoa(Pessoa pessoa) {
        return this.pessoaRepository.save(pessoa);
    }

    @Override
    public Pessoa recuperaPessoa(String id) {
        return this.pessoaRepository
                .findById(id)
                .orElseThrow(PessoaNotFoundException::new);
    }
}
