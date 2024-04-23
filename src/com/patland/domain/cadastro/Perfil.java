package com.patland.domain.cadastro;

public class Perfil {

  private boolean cliente;
  private boolean fornecedor;
  private boolean prestador;

  public boolean getCliente() {
    return this.cliente;
  }

  public boolean getFornecedor() {
    return this.fornecedor;
  }

  public boolean getPrestador() {
    return this.prestador;
  }

  public Perfil(boolean cliente, boolean fornecedor, boolean prestador) {
    this.cliente = cliente;
    this.fornecedor = fornecedor;
    this.prestador = prestador;
  }
}
