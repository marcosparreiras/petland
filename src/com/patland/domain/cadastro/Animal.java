package com.patland.domain.cadastro;

import java.time.LocalDate;

public class Animal {

  private Integer id;
  private String nome;
  private LocalDate aniversario;
  private Especie especie;

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

  public LocalDate getAniversatio() {
    return this.aniversario;
  }

  public void setAniversario(LocalDate aniversario) {
    this.aniversario = aniversario;
  }

  public Especie getEspecie() {
    return this.especie;
  }

  public void setEspecie(Especie especie) {
    this.especie = especie;
  }

  public Animal() {}

  public Animal(
    Integer id,
    String nome,
    LocalDate aniversario,
    Especie especie
  ) {
    this.id = id;
    this.nome = nome;
    this.aniversario = aniversario;
    this.especie = especie;
  }
}
