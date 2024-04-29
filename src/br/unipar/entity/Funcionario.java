package br.unipar.entity;

import java.time.LocalDateTime;

public class Funcionario extends Pessoa {

    private LocalDateTime dateContrato;

    private Double salario;

    private String rg;

    public LocalDateTime getDateContrato() {
        return dateContrato;
    }

    public void setDateContrato(LocalDateTime dateContrato) {
        this.dateContrato = dateContrato;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
