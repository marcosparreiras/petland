package com.patland.domain.cadastro;

public class Endereco {

  private String lagradouro;
  private Integer numero;

  public String getLagradouto() {
    return this.lagradouro;
  }

  public Integer getNumero() {
    return this.numero;
  }

  public Endereco(String lagradouro, Integer numero) {
    this.lagradouro = lagradouro;
    this.numero = numero;
  }
}
