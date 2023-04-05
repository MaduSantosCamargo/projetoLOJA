package com.example.projetoLOJA.controller;

import com.example.projetoLOJA.model.Produto;
import com.example.projetoLOJA.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiProduto")
public class ProdutoController
{
    //inclusão de clientes
    //exclusão de clientes
    //atualização de clientes

    //busca de produtos por código
    //busca de produtos por descrição
    //busca de produtos por autor
    //busca de produtos por preço

    @Autowired
    ProdutoRepository prRepo;

    @PostMapping("/inserir")
    public void inserir (@RequestBody Produto pr)
    {
        prRepo.save(pr);
    }

    @DeleteMapping("/removerPorCodigo/{codigo}")
    public void removerPorCODIGO (@PathVariable (value ="codigo") int codigo)
    {
        prRepo.deleteById(codigo);
    }

    @PutMapping ("/atualizar")
    public void atualizaProduto (@RequestBody Produto pr)
    {
        prRepo.save(pr);
    }

    @GetMapping ("/todos")
    public List<Produto> buscarTodos ()
    {
        return prRepo.findAll();
    }

    @GetMapping("/buscarPorCodigo/{codigo}")
    public Optional<Produto> buscarPorCODIGO (@PathVariable(value ="codigo") int codigo)
    {
        return prRepo.findById(codigo);
    }

    @GetMapping("/buscarPorDescricao/{descricao}")
    public List<Produto> procurarPorDescricao (@PathVariable (value="descricao") String descricao)
    {
        return prRepo.findByDescricao(descricao);
    }

    @GetMapping("/porAutor/{autor}")
    public List<Produto> procurarPorEmail (@PathVariable (value="autor") String autor)
    {
        return prRepo.findByAutor(autor);
    }

    @GetMapping("/porPreco/{preco}")
    public List<Produto> procurarPorPreco (@PathVariable (value="preco") float preco)
    {
        return prRepo.findByPreco(preco);
    }

    @GetMapping("/porTitulo/{titulo}")
    public List<Produto> procurarPorTitulo (@PathVariable (value="titulo") String titulo)
    {
        return prRepo.findByTitulo(titulo);
    }

}
