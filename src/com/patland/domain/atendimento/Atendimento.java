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
  private Double valor;
  private AtendimentoTipo tipo;
  private AtendimentoStatus status;

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

  public Double getValor() {
    return this.valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public AtendimentoTipo getTipo() {
    return this.tipo;
  }

  public void setTipo(AtendimentoTipo tipo) {
    this.tipo = tipo;
  }

  public AtendimentoStatus getStatus() {
    return this.status;
  }

  public void setStatus(AtendimentoStatus status) {
    this.status = status;
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
    Double valor,
    AtendimentoTipo tipo,
    AtendimentoStatus status
  ) {
    this.id = id;
    this.descicao = descricao;
    this.data = data;
    this.hora = hora;
    this.solicitante = solicitante;
    this.paciente = paciente;
    this.servico = servico;
    this.valor = valor;
    this.tipo = tipo;
    this.status = status;
  }
}
