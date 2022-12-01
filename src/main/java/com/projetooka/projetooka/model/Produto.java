package com.projetooka.projetooka.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Nome do produto é obrigatório")
	private String nome;

	@NotBlank(message = "Descricao é obrigatória")
	private String descricao;

	@NotNull(message = "Preço é obrigatório")
	private BigDecimal preco;

	@NotNull(message = "Deve ser verdadeiro ou falso")
	private Boolean ativo;

	@NotNull(message = "Deve conter um valor de produto")
	private Integer quantidade;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
}
