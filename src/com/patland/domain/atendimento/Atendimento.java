package com.patland.domain.atendimento;

import com.patland.domain.cadastro.Animal;
import com.patland.domain.cadastro.Cadastro;
import com.patland.domain.cadastro.ProdutoServico;
import java.time.LocalDate;
import java.time.LocalTime;

public class Atendimento {

  private Integer id;
  private String descicao;
  private LocalDate data;
  private LocalTime hora;
  private Cadastro solicitante;
  private Animal paciente;
  private ProdutoServico servico;

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

  public Cadastro getSolicitante() {
    return this.solicitante;
  }

  public Animal getPaciente() {
    return this.paciente;
  }

  public ProdutoServico getServico() {
    return this.servico;
  }

  public Atendimento() {}

  public Atendimento(
    Integer id,
    String descricao,
    LocalDate data,
    LocalTime hora,
    Cadastro solicitante,
    Animal paciente,
    ProdutoServico servico
  ) {
    this.id = id;
    this.descicao = descricao;
    this.data = data;
    this.hora = hora;
    this.solicitante = solicitante;
    this.paciente = paciente;
    this.servico = servico;
  }
}
