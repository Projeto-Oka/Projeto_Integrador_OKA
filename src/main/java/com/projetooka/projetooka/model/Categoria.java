package com.projetooka.projetooka.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Categoria é obrigatório!")
    @Size(min = 5, max = 255, message = "O nome deve ter entre 5 e 255 caracteres!!")
    private String nome;

    @NotBlank(message = "Categoria é obrigatório!")
    @Size(min = 5, max = 255, message = "A descrição deve ter entre 5 e 255 caracteres!!")
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
