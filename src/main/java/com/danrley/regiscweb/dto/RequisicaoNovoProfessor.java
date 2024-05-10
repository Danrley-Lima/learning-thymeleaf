package com.danrley.regiscweb.dto;

import java.math.BigDecimal;

import com.danrley.regiscweb.models.Professor;
import com.danrley.regiscweb.models.StatusProfessor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class RequisicaoNovoProfessor {

  @NotBlank
  @NotNull
  private String nome; // em caso de erro, NotBlank.requisicaoNovoProfessor.nome

  @Positive
  @NotNull
  private BigDecimal salario;

  @NotNull
  private StatusProfessor statusProfessor;

  public Professor toProfessor() {
    Professor professor = new Professor();
    professor.setNome(this.nome);
    professor.setSalario(this.salario);
    professor.setStatusProfessor(this.getStatusProfessor());

    return professor;
  }

  @Override
  public String toString() {
    return "RequisicaoNovoProfessor [nome=" + nome + ", salário=" + salario + ", statusProfessor=" + statusProfessor
        + "]";
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public BigDecimal getSalario() {
    return salario;
  }

  public void setSalario(BigDecimal salario) {
    this.salario = salario;
  }

  public StatusProfessor getStatusProfessor() {
    return statusProfessor;
  }

  public void setStatusProfessor(StatusProfessor statusProfessor) {
    this.statusProfessor = statusProfessor;
  }
}
