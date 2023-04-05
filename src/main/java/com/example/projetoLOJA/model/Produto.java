package com.example.projetoLOJA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Projeto_Produto")
public class Produto
{
    @Id
    private int codigo;
    @Column
    private String descricao;
    @Column
    private String autor;
    @Column
    private float preco;
    @Column
    private String titulo;

    public int getCodigo()
    {
        return codigo;
    }
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPreco()
    {
        return preco;
    }
    public void setPreco(float preco)
    {
        this.preco = preco;
    }

    public String getTitulo()
    {
        return titulo;
    }
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
}
