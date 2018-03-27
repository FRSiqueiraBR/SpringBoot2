package com.example.SpringBoot2.service;

import com.example.SpringBoot2.document.Pessoa;

public interface PessoaService {
    Pessoa criarPessoa(Pessoa pessoa);

    Pessoa recuperaPessoa(String id);
}
