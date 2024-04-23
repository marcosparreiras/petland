package com.patland.domain.cadastro;

public class Cadastro {

  private Integer id;
  private String nome;
  private Perfil perfil;
  private Endereco endereco;

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

  public Perfil getPerfil() {
    return this.perfil;
  }

  public void setPerfil(Perfil perfil) {
    this.perfil = perfil;
  }

  public Endereco getEndereco() {
    return this.endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public Cadastro() {}

  public Cadastro(Integer id, String nome, Perfil perfil, Endereco endereco) {
    this.id = id;
    this.nome = nome;
    this.perfil = perfil;
    this.endereco = endereco;
  }
}
