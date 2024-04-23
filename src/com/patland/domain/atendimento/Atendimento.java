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
  private AtendimentoTipo atendimentoTipo;
  private AtendimentoStatus atendimentoStatus;

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescricao() {
    return this.descicao;
  }

  public void setDescricao(String descricao) {
    this.descicao = descricao;
  }

  public LocalDate getData() {
    return this.data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public LocalTime getHora() {
    return this.hora;
  }

  public void setHora(LocalTime hora) {
    this.hora = hora;
  }

  public Cadastro getSolicitante() {
    return this.solicitante;
  }

  public void setSolicitante(Cadastro solicitante) {
    this.solicitante = solicitante;
  }

  public Animal getPaciente() {
    return this.paciente;
  }

  public void setPaciente(Animal paciente) {
    this.paciente = paciente;
  }

  public ProdutoServico getServico() {
    return this.servico;
  }

  public void setServico(ProdutoServico servico) {
    this.servico = servico;
  }

  public AtendimentoTipo getAtendimentoTipo() {
    return this.atendimentoTipo;
  }

  public void setAtendimentoTipo(AtendimentoTipo atendimentoTipo) {
    this.atendimentoTipo = atendimentoTipo;
  }

  public AtendimentoStatus getAtendimentoStatus() {
    return this.atendimentoStatus;
  }

  public void setAtendimentoStatus(AtendimentoStatus atendimentoStatus) {
    this.atendimentoStatus = atendimentoStatus;
  }

  public Atendimento() {}

  public Atendimento(
    Integer id,
    String descricao,
    LocalDate data,
    LocalTime hora,
    Cadastro solicitante,
    Animal paciente,
    ProdutoServico servico,
    AtendimentoTipo atendimentoTipo,
    AtendimentoStatus atendimentoStatus
  ) {
    this.id = id;
    this.descicao = descricao;
    this.data = data;
    this.hora = hora;
    this.solicitante = solicitante;
    this.paciente = paciente;
    this.servico = servico;
    this.atendimentoTipo = atendimentoTipo;
    this.atendimentoStatus = atendimentoStatus;
  }
}
