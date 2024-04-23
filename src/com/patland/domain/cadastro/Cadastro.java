package com.patland.domain.cadastro;

public class Cadastro {

  private Integer id;
  private String nome;

  public Integer getId() {
    return this.id;
  }

  public String getNome() {
    return this.nome;
  }

  public Cadastro(Integer id, String nome) {
    this.id = id;
    this.nome = nome;
  }
}
