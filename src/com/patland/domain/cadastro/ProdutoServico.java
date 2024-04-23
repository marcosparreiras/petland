package com.patland.domain.cadastro;

public class ProdutoServico {

  private Integer id;
  private String nome;
  private Double valor;
  private boolean servico;

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getValor() {
    return this.valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public boolean getServico() {
    return this.servico;
  }

  public void setServico(boolean servico) {
    this.servico = servico;
  }

  public ProdutoServico() {}

  public ProdutoServico(
    Integer id,
    String nome,
    Double valor,
    boolean servico
  ) {
    this.id = id;
    this.nome = nome;
    this.valor = valor;
    this.servico = servico;
  }
}
