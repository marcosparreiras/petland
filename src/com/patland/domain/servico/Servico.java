package com.patland.domain.servico;

import java.sql.Date;
import java.sql.Time;

public class Servico {

  private Integer id;
  private String descicao;
  private Date data;
  private Time hora;
  private Integer cadastroId;

  public Integer getId() {
    return this.id;
  }

  public String getDescricao() {
    return this.descicao;
  }

  public Date getData() {
    return this.data;
  }

  public Time getHora() {
    return this.hora;
  }

  public Integer getCadastroId() {
    return this.cadastroId;
  }

  public Servico(
    Integer id,
    String descricao,
    Date data,
    Time hora,
    Integer cadastroId
  ) {
    this.id = id;
    this.descicao = descricao;
    this.data = data;
    this.hora = hora;
    this.cadastroId = cadastroId;
  }
}
