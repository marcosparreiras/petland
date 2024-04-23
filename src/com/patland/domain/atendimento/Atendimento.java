package com.patland.domain.atendimento;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atendimento {

  private Integer id;
  private String descicao;
  private LocalDate data;
  private LocalTime hora;
  private Integer cadastroId;

  public Integer getId() {
    return this.id;
  }

  public String getDescricao() {
    return this.descicao;
  }

  public LocalDate getData() {
    return this.data;
  }

  public LocalTime getHora() {
    return this.hora;
  }

  public Integer getCadastroId() {
    return this.cadastroId;
  }

  public Atendimento(
    Integer id,
    String descricao,
    LocalDate data,
    LocalTime hora,
    Integer cadastroId
  ) {
    this.id = id;
    this.descicao = descricao;
    this.data = data;
    this.hora = hora;
    this.cadastroId = cadastroId;
  }
}
