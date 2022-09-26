/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author estudiante
 */
public class Catedratico extends Profesor
{
    Integer numContrato, numHoras;
    double valorHora;

    public Catedratico() {
    }

    public Catedratico(Integer numContrato, Integer numHoras, double valorHora) {
        this.numContrato = numContrato;
        this.numHoras = numHoras;
        this.valorHora = valorHora;
    }

    public Integer getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(Integer numContrato) {
        this.numContrato = numContrato;
    }

    public Integer getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(Integer numHoras) {
        this.numHoras = numHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double calcularSalario()
    {
        double salarioTotal=0;
        
        return salarioTotal;
    }
}
