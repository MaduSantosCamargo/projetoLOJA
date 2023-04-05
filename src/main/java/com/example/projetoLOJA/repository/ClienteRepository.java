package com.example.projetoLOJA.repository;

import com.example.projetoLOJA.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository <Cliente, Integer>
{
    public List<Cliente> findByNome (String nome);

    public List<Cliente> findByEmail (String email);
}
