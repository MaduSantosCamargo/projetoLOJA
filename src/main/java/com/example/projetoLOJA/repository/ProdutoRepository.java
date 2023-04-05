package com.example.projetoLOJA.repository;


import com.example.projetoLOJA.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//busca de produtos por código
//busca de produtos por descrição
//busca de produtos por autor
//busca de produtos por preço


public interface ProdutoRepository  extends JpaRepository <Produto, Integer>
{
    public List<Produto> findByDescricao (String descricao);
    public List<Produto> findByAutor (String autor);
    public List<Produto> findByPreco (float preco);
    public List<Produto> findByTitulo (String titulo);
}
