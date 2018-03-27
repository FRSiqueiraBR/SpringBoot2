package com.example.SpringBoot2.repository;

import com.example.SpringBoot2.document.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PessoaRepository extends CrudRepository<Pessoa, String> {

}
