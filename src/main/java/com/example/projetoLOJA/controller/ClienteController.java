package com.example.projetoLOJA.controller;

import com.example.projetoLOJA.model.Cliente;
import com.example.projetoLOJA.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiCliente")
public class ClienteController
{
    //busca de clientes por código
    //busca de clientes por nome
    //busca de clientes por e-mail

    //inclusão de clientes
    //exclusão de clientes
    //atualização de clientes

    @Autowired
    ClienteRepository clRepo;

    @PostMapping("/inserir")
    public void inserir (@RequestBody Cliente cl)
    {
        clRepo.save(cl);
    }

    @DeleteMapping ("/removerPorCodigo/{codigo}")
    public void removerPorCODIGO (@PathVariable (value ="codigo") int codigo)
    {
        clRepo.deleteById(codigo);
    }

    @PutMapping ("/atualizar")
    public void atualizaCliente (@RequestBody Cliente cl)
    {
        clRepo.save(cl);
    }


    @GetMapping ("/todos")
    public List<Cliente> buscarTodos ()
    {
        return clRepo.findAll();
    }

    @GetMapping("/buscarPorCodigo/{codigo}")
    public Optional<Cliente> buscarPorCODIGO (@PathVariable(value ="codigo") int codigo)
    {
        return clRepo.findById(codigo);
    }

    @GetMapping("/buscarPorNome/{nome}")
    public List<Cliente> procurarPorNome (@PathVariable (value="nome") String nome)
    {
        return clRepo.findByNome(nome);
    }

    @GetMapping("/porEmail/{email}")
    public List<Cliente> procurarPorEmail (@PathVariable (value="email") String email)
    {
        return clRepo.findByEmail(email);
    }


}
